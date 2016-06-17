package org.boreas.design.observer;

import java.util.Observable;

/**
 * Created by xiangshuai on 16/6/15.
 */
public class NanoBoard extends AbsBoard<WeatherStation> {

    private long temperature;
    private long lastTemperature;

    public NanoBoard(WeatherStation weatherStation) {
        super(weatherStation);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherStation) {
            lastTemperature = temperature;
            temperature = ((WeatherStation) o).getTemperature();
        }
        display();
    }

    @Override
    public void display() {
        long l = temperature - lastTemperature;
        System.out.println(l > 0 ? "会更热" : l < 0 ? "会更冷" : "气温无变化");


    }
}

package org.boreas.design.observer;

import java.util.Observable;

/**
 * Created by xiangshuai on 16/6/15.
 */
public class ObserverApplication {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Board board= new AbsBoard<WeatherStation>(weatherStation) {
            private long temperature;
            private long lastTemperature;
            private long lastLastTemperature;

            @Override
            public void display() {

                if (temperature >= lastTemperature) {
                    if (lastTemperature >= lastLastTemperature && temperature > lastLastTemperature) {
                        System.out.println("逐渐升温");
                    }

                }


            }

            @Override
            public void update(Observable o, Object arg) {
                WeatherStation o1 = (WeatherStation) o;

                lastLastTemperature=lastTemperature;
                lastTemperature=temperature;
                temperature = o1.getTemperature();
                display();

            }
        };


        NanoBoard nanoBoard = new NanoBoard(weatherStation);


        weatherStation.setTemperature(99l);
        weatherStation.setTemperature(100l);

        weatherStation.setTemperature(101l);

        weatherStation.setTemperature(102l);

    }
}

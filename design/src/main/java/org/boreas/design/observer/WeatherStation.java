package org.boreas.design.observer;

import java.util.Observable;

/**
 * Created by xiangshuai on 16/6/15.
 */
public class WeatherStation extends Observable {

    private long temperature;

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
        update();
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}

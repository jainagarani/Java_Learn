package designpappern.behavioural.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}

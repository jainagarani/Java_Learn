package designpappern.behavioural.observerPattern;

public class ObserverPatternDemo {

    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneObserver = new PhoneDisplay();
        Observer ledObserver = new LEDDisplay();
        weatherStation.add(phoneObserver);
        weatherStation.add(ledObserver);
        weatherStation.setTemperature(30.0f);
        weatherStation.setTemperature(35.0f);
    }
}

package designpappern.behavioural.observerPattern;

public class LEDDisplay implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("In LEDDisplay temperature is "+temp);
    }
}

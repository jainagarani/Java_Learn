package designpappern.behavioural.observerPattern;

public class PhoneDisplay implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("In Phone display temperature is "+temp);
    }
}

package designpattern.creational.factory;

public abstract class Plan {
    public abstract int getRate();

    public int getBill(int units){
        return units *getRate();
    }

}

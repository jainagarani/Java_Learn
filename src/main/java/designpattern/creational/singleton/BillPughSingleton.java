package designpattern.creational.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private BillPughSingleton(){

    }

    private static class LazyHolder{
        private static  final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public BillPughSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }
}

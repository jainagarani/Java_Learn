package designpattern.creational.singleton;

public class EagerSingletonExample {
    private static EagerSingletonExample singletonExample = new EagerSingletonExample();

    private EagerSingletonExample(){

    }

    public EagerSingletonExample getSingletonInstance(){
        return singletonExample;
    }




}

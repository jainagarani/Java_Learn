package java8.basics2023.designpatter.creational;

import java.io.Serializable;

public class SingletonExample implements Serializable {
    private static SingletonExample singletonExample;

    private SingletonExample(){

    }

    public static SingletonExample getInstance(){
        if(null == singletonExample){
            synchronized (SingletonExample.class){
                if(null == singletonExample){
                    singletonExample = new SingletonExample();
                }
            }
        }
        return singletonExample;
    }

    protected Object readResolve(){
        return getInstance();
    }
    

}

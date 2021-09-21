package designpattern.creational.singleton;

import java.io.Serializable;

public class LazySingletonExample implements Serializable {
    private static final long serialVersionUID = 1L;
    private static volatile LazySingletonExample lazySingletonExample = null;

    private LazySingletonExample(){

    }

    public LazySingletonExample getInstance(){
        if(null == lazySingletonExample ){
            synchronized (LazySingletonExample.class){
                if(null == lazySingletonExample) {
                    lazySingletonExample = new LazySingletonExample();
                }
            }

        }
        return lazySingletonExample;
    }
    protected Object readResolve(){
        return getInstance();
    }
}

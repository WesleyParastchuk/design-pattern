package parastchuk.creational.singleton;

import parastchuk.UseExample;

public class SingletonUseExample implements UseExample {
 
    public void run() {
        Singleton singletonInstance = Singleton.getInstance();
        
        singletonInstance.doSomething();
    }
}

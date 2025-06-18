package parastchuk;

import parastchuk.creational.factoryMethod.FactoryMethodUseExample;
import parastchuk.creational.singleton.SingletonUseExample;
import parastchuk.creational.builder.BuilderUseExample;

public class App {
    public static void main(String[] args) {
        
        UseExample example = new FactoryMethodUseExample();
        example.run();

        System.out.println("Hello World!");
    }
}

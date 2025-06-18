package parastchuk.creational.factoryMethod;

import parastchuk.UseExample;
import parastchuk.creational.factoryMethod.factory.Factory;
import parastchuk.creational.factoryMethod.factory.FactoryItemA;
import parastchuk.creational.factoryMethod.factory.FactoryItemB;
import parastchuk.creational.factoryMethod.item.Item;

public class FactoryMethodUseExample implements UseExample {
 
    public void run() {
        Factory factoryItemA = new FactoryItemA();
        Factory factoryItemB = new FactoryItemB();

        Item itemA = factoryItemA.factoryMethod();
        Item itemB = factoryItemB.factoryMethod();

        itemA.displayName();
        itemB.displayName();
    }
}

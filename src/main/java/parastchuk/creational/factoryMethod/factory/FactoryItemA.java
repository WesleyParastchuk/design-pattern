package parastchuk.creational.factoryMethod.factory;

import parastchuk.creational.factoryMethod.item.ItemA;
import parastchuk.creational.factoryMethod.item.Item;

public class FactoryItemA extends Factory {

    @Override
    public Item factoryMethod() {
        return new ItemA();
    }
    
}

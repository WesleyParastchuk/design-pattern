package parastchuk.creational.factoryMethod.factory;

import parastchuk.creational.factoryMethod.item.ItemB;
import parastchuk.creational.factoryMethod.item.Item;

public class FactoryItemB extends Factory {

    @Override
    public Item factoryMethod() {
        return new ItemB();
    }
    
}

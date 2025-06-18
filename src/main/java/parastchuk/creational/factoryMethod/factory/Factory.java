package parastchuk.creational.factoryMethod.factory;

import parastchuk.creational.factoryMethod.item.Item;

public abstract class Factory {
    public abstract Item factoryMethod();

    public void execute() {
        Item item = factoryMethod();
        item.displayName();
    }
} 
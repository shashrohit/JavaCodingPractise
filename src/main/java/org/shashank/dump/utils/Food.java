package org.shashank.dump.utils;

public abstract class Food {

    public String color;

    Food(String color){
        this.color = color;
    }
    public void getColor(){

    }

    public abstract void nutrients();
}

class Fruit extends Food{

    Fruit(String color) {
        super(color);
    }

    @Override
    public void nutrients() {

    }
}

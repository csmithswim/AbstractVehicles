package com.csmithswim;


public class Car {

    private int horsePower;
    private int mph;
    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    private int getMph() {
        return mph;
    }

    private int accelerate() {
        return mph += (10 / 1);
    }

    private int brake() {
        if (mph < 6) {
            System.out.println("Car is not moving!");
            return mph = 0;
        } else {
            return mph -= 5;
        }
    }

    private int coast() {
        return mph;
    }

}

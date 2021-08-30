package com.csmithswim;
public class Car {
    Engine engine;

    private int horsePower;
    private int mph;
    private int fuelTank;
    private int mpg;

    Car(Engine engine) {
        this.engine = engine;

        switch (engine.getName().toUpperCase()) {
            case "ELECTRIC":
                fuelTank = 2;
                horsePower = 480;
                mpg = 133;
                break;
            case "HYBRID":
                fuelTank = 11;
                horsePower = 121;
                mpg = 58;
                break;
            case "V6":
                fuelTank = 24;
                horsePower = 300;
                mpg = 26;
                break;
            case "V8":
                fuelTank = 15;
                horsePower = 700;
                mpg = 22;
                break;
        }
    }

    public int getMph() {
        return mph;
    }

    public int accelerate() {
        return mph += (10 / 1);
    }

    public int brake() {
        if (mph < 6) {
            System.out.println("Car is not moving!");
            return mph = 0;
        } else {
            return mph -= 5;
        }
    }

    public int coast() {
        return mph;
    }
}

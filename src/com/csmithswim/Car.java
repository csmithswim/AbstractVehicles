package com.csmithswim;
public class Car {
    Engine engine;

    //TODO figure out how to deduct gas from fuel tank when car is accelerated

    //TODO define tick

    private int horsePower;
    private int mph;
    private int fuelTank;
    private int mpg;
    private int maxSpeed;
    private int tireFriction;
    private int odometer;

    Car(Engine engine) {
        this.engine = engine;

        switch (engine.getName().toUpperCase()) {
            case "ELECTRIC":
                fuelTank = 2;
                horsePower = 480;
                mpg = 133;
                maxSpeed = 160;
                tireFriction = 1;
                odometer = 0;
                break;
            case "HYBRID":
                fuelTank = 11;
                horsePower = 121;
                mpg = 58;
                maxSpeed = 100;
                tireFriction = 1;
                odometer = 0;
                break;
            case "V6":
                fuelTank = 24;
                horsePower = 300;
                mpg = 26;
                maxSpeed = 180;
                tireFriction = 1;
                odometer = 0;
                break;
            case "V8":
                fuelTank = 15;
                horsePower = 700;
                mpg = 22;
                maxSpeed = 200;
                tireFriction = 1;
                break;
        }
    }

    public int getMph() {
        return mph;
    }

    public int getOdometer() { return odometer; }

    public int accelerate() {
        if (mph + 10 >= maxSpeed) {
            System.out.println("Too fast too furious! mph cannot exceed max speed of " + this.maxSpeed);
            System.out.print("\n" + this.engine.getName() + " is travelling at " + this.getMph() + " MPH.\n\n");
            odometer += mph / 4;
            return mph;
        }
        mph += (10 / 1) - this.tireFriction;
        odometer = mph / 4;
        System.out.print("\n" + this.engine.getName() + " accelerated and travelling at " + this.getMph() + " MPH.\n\n");
        return mph;
    }

    public int brake() {
        if (mph <= 5) {
            System.out.println("Car is not moving!\n");
            return mph = 0;
        } else {
            mph -= 5 - this.tireFriction;
            odometer += mph / 4;
            System.out.println("\n" + this.engine.getName() + " braked.and travelling at " + this.getMph() + " MPH.\n\n");
            return mph - this.tireFriction;
        }
    }

    public int coast() {
        odometer += (mph - this.tireFriction) / 4;
        mph -= this.tireFriction;
        System.out.println("\n" + this.engine.getName() + " coasted and travelling at " + this.getMph() + " MPH.\n\n");

        return mph - this.tireFriction;
    }
}

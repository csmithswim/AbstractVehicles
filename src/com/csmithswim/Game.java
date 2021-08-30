package com.csmithswim;

public class Game {
    Console console = new Console();
    boolean gameRunning;
    public void startGame() {
    StringBuilder consoleMessager = new StringBuilder();
        gameRunning = true;

        while (gameRunning) {
            Engine engine = new Engine(console.greetAndGetChoice());
            System.out.println(consoleMessager.append("You have chosen a " + engine.getName() + ".\n"));
            Car car = new Car(engine);
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.brake();
            car.brake();

            System.out.println(car.getMph());
        }
    }
}


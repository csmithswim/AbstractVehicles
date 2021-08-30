package com.csmithswim;

public class Game {
    Console console = new Console();
    boolean gameRunning;

    public void startGame() {
        Engine engine = new Engine(console.greetAndGetEngineChoice());
        Car car = new Car(engine);
        Course course = new Course(10);

        gameRunning = true;
        int timeInMinutes = 0;

        StringBuilder consoleMessage = new StringBuilder("You have chosen a " + engine.getName() + ". You have " + course.getCourseLength() + " miles to " +
                "drive! Better put your pedal on the medal!!!!!!!!\n");
        StringBuilder displayTime = new StringBuilder("The current time is " + timeInMinutes + " minutes.");
        System.out.println(consoleMessage);
        System.out.println(displayTime);


        while (gameRunning) {
            if (car.getOdometer() >= course.getCourseLength()) {
                System.out.println(consoleMessage.replace(0, consoleMessage.length(), "Car finished the race, good bye!!!!!"));
                break;
            }

            String decision = console.getCarAction();

            if (decision.equalsIgnoreCase("exit")) {
                System.out.println(consoleMessage.replace(0, consoleMessage.length(), "Goodbye!!!!!"));
                break;
            }

            //After 15 minutes, how many miles has a car traveled? for 40 mph
            switch (decision.toUpperCase()) {
                case "BRAKE": car.brake();
                    break;
                case "ACCELERATE": car.accelerate();
                    break;
                case "COAST": car.coast();
                    break;
            }
            timeInMinutes += 15;

            if (timeInMinutes >= 60) {
                System.out.println(displayTime.replace(0, displayTime.length(),String.valueOf(timeInMinutes/60) + " hour(s) has passed and "
                        + + (timeInMinutes % 60) + " minutes have passed."));
            } else {
            System.out.println(displayTime.replace(0, displayTime.length(), String.valueOf(timeInMinutes) + " minutes has passed."));

            }

            System.out.println(consoleMessage.replace(0, consoleMessage.length(), "The " +
                    engine.getName() + " has driven " + car.getOdometer() + " miles.\n"));
        }

    }
}







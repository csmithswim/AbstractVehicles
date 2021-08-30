package com.csmithswim;

import java.util.Scanner;

public class Console {

    public String greetAndGetEngineChoice() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder consoleMessage = new StringBuilder("   -           __\n" +
                " --          ~( @\\   \\\n" +
                "---   _________]_[__/_>________\n" +
                "     /  ____ \\ <>     |  ____  \\\n" +
                "    =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
                "________(__)_____________(__)____\n\n\n" +
                "     ELECTRIC                              HYBRID                             V6                                    V8\n" +
                "HP / MPG / Fuel Tank                 HP/ MPG / Fuel Tank               HP/ MPG / Fuel Tank                   HP/ MPG / Fuel Tank\n" +
                "480 HP/ 133 MPG/ 2-gallons           121 HP/ 58 MPG/ 11-gallons        300 HP/ 26 MPG/ 24-gallons            700 HP/ 22 MPG/ 15-gallons\n\n" +
                "Which type of car would you like to race? The available options are [ELECTRIC, HYBRID, V6, V8].\n\n");
        System.out.print(consoleMessage);

        do {
            System.out.print(consoleMessage.replace(0,consoleMessage.length(), "Input:"));
            String output = scanner.nextLine();
            String[] validChoices = new String[]{"ELECTRIC", "HYBRID", "V6", "V8"};
            boolean choiceIsValid = false;
            for (String e : validChoices) {
                if (output.equalsIgnoreCase(e)) {
                    choiceIsValid = true;
                }
            }
            if (choiceIsValid == true) {
                return output;
            } else {
                consoleMessage.replace(0, consoleMessage.length(), "\nError. Input choices are [ELECTRIC, HYBRID, V6, V8].\n");
                System.out.println(consoleMessage);
            }
        } while (true);
    }

    public String getCarAction() {
        StringBuilder message = new StringBuilder("What type of action do you want to perform? The available options are [ACCELERATE, BRAKE, COAST, EXIT]\n" +
                "Input:");
        System.out.print(message);

        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] options = new String[]{"ACCELERATE", "BRAKE", "COAST", "EXIT"};
            boolean validInput = false;
            for (String e : options) {
                if (input.equalsIgnoreCase(e)) {
                    validInput = true;
                }
            }
            if (validInput == true) {
                return input;
            } else {
                message.replace(0, message.length(), "Invalid entry.\n" +
                        "What type of action do you want to perform? The available options are [ACCELERATE, BRAKE, COAST, EXIT].\n" +
                        "\nInput:");
                System.out.print(message);
            }
        } while (true);



    }


    //Uses wind resistance, time limit, course length and car methods



}



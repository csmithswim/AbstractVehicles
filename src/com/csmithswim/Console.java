package com.csmithswim;

import java.util.Scanner;

public class Console {

    public String greetAndGetChoice() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder query = new StringBuilder("   -           __\n" +
                " --          ~( @\\   \\\n" +
                "---   _________]_[__/_>________\n" +
                "     /  ____ \\ <>     |  ____  \\\n" +
                "    =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
                "________(__)_____________(__)____\n\n\n" +
                "     ELECTRIC                              HYBRID                             V6                                    V8\n" +
                "HP / MPG / Fuel Tank                 HP/ MPG / Fuel Tank               HP/ MPG / Fuel Tank                   HP/ MPG / Fuel Tank\n" +
                "480 HP/ 133 MPG/ 2-gallons           121 HP/ 58 MPG/ 11-gallons        300 HP/ 26 MPG/ 24-gallons            700 HP/ 22 MPG/ 15-gallons\n\n" +
                "Which type of car would you like to race? The available options are [ELECTRIC, HYBRID, V6, V8].\n\n");
        System.out.print(query);

        do {
            System.out.print(query.replace(0,query.length(), "Input:"));
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
                query.replace(0, query.length(), "\nError. Input choices are [ELECTRIC, HYBRID, V6, V8].\n");
                System.out.println(query);
            }
        } while (true);
    }


}



package com.csmithswim;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        StringBuilder query = new StringBuilder("The available options are [ELECTRIC, HYBRID, V6, V8].\n\n" +
                "     ELECTRIC                              HYBRID                             V6                                    V8\n" +
    "HP / MPG / Fuel Tank                 HP/ MPG / Fuel Tank               HP/ MPG / Fuel Tank                   HP/ MPG / Fuel Tank\n" +
                "480 HP/ 133 MPG/ 2-gallons           121 HP/ 58 MPG/ 11-gallons        300 HP/ 26 MPG/ 24-gallons            700 HP/ 22 MPG/ 15-gallons\n\n" +
                "Which type of car would you like to race?\n" +
                "Input: ");
        System.out.println(query);
    }

}


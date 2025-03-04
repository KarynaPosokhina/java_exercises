package com.example.java_api_metods.models;

import java.time.LocalDate;

public class Logger {
    private String name;

    public Logger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void Log(String message) {
        System.out.println(message);
    }

    // a method which checks if the logger name ends with the given input string
    // yes or no

    public Boolean CheckLog(String input) {
           //endsWith
        return this.name.equals(input);
    }

    // method to append text to the name and return new text/name

    public String appendName(String input) {
        return this.name.concat(input);
    }

    //method which turns a number into a string
    // I want to be able to call it on class level instead of object level

    public static String changeToString(int number) {
        // logger.changeToString
        return Integer.toString(number);
    }

    //I want to return the character based on its position
    public char getCharacterAtPosition(int position) {
        return this.name.charAt(position);
    }

    // compare two doubles and return something so we know they're the same

    public int compareNumbers(double a, double b) {
        return Double.compare(a, b);
    }

    //     public int compareNumbersVersionTwo(Double a, Double b) {
    //        a.compareTo(b);
    //    }


}

package com.example.java_api_metods;

import com.example.java_api_metods.models.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class JavaApiMethodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaApiMethodsApplication.class, args);

        // Let's create a new logger
        Logger logger = new Logger("Boobies");

        System.out.println("Logger name = " + logger.getName());

        Logger.Log("The message to log");

        Logger.Log("Logger name ends with Name?" + logger.CheckLog("Boob"));

        Logger.Log("Concat: " + logger.appendName(" Something"));

        Logger.Log("It changed to string, but we dont see it: " + Logger.changeToString(1999));

        Logger.Log("CharAt: " + logger.getCharacterAtPosition(4));

        Logger.Log("Compares: " + logger.compareNumbers(8,10));

        // LocalDate class
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate d1january12025 = LocalDate.of(2025,1,1);
        System.out.println(d1january12025);

        System.out.println(today.getMonth());

        //From string to localdate, we should know this one!
        //1/3/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateFromString = LocalDate.parse("01/03/2022", dtf);

        System.out.println(localDateFromString);

        // From localdate to string (in a specific format)
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateToParse = LocalDate.now();

        System.out.println(dateToParse.format(dtf2));

    }
}


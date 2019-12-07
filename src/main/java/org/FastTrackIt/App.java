package org.FastTrackIt;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;import java.io.*;
import inputprocessingoutput2.MadLib;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello");

        System.out.println("What is your name? ");
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");


        System.out.println("What is the input string?");
        String s = "Homer";
        Scanner scanner = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("has " + s.length() + " characters.");



        System.out.println("What is your name?");
        String name1;
        Scanner sc1 = new Scanner(System.in);
        name1 = sc1.nextLine();
        System.out.println("You have a car?");
        String car;
        car = sc.nextLine();
        System.out.println("what car do you have?");
        String what =sc.nextLine();

        System.out.println(name1 +" said, " +  car + " I have a car a "+ what);

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a noun :");
        String noun = keyboardInput.nextLine();
        System.out.println("Enter a verb :");
        String verb = keyboardInput.nextLine();
        System.out.println("Enter a adjective :");
        String adjective = keyboardInput.nextLine();
        System.out.println("Enter a adverb :");
        String adverb = keyboardInput.nextLine();

        System.out.println("Do you" + verb + "your" + adjective + noun + adverb + "That's hilarious! ");












        int x;
        int y;
        int result;
        result = 10 + 5;

        System.out.println("The result is " + result);
        result = 10 - 5;
        System.out.println("The result is " + result);
        result = 10 * 5;
        System.out.println("The result is " + result);
        result = 10 / 5;
        System.out.println("The result is " + result);

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1988,12,14);
        int years = Period.between(birthDate,today).getYears();
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);

        int currentAge = 25;
        int retireAge = 65;
        result = retireAge - currentAge;
        System.out.println("What is your current age?");
        System.out.println("25");
        System.out.println("At what age would you like to retire?");
        System.out.println("65");
        System.out.println("You have " +result+ " years left until you can retire.");
        int currentYear = 2015;
        result = currentYear + result;
        System.out.println("It's 2015, so you can retire in " + result);




    }


}

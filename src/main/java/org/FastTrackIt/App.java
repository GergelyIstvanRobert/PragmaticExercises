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

        String whatIsYourName = "What is your name?";
        String name = " Brian";
        String greeting = "\nHello ";
        String name1 = ", Brian";
        String meet = ", nice to meet you!";
        String sentence = whatIsYourName + name+ greeting + name1 + meet;
        System.out.println(sentence);

        String s="Homer";
        System.out.println(s.length());

        String whatIsThe = "What is the quote?";
        String these = " These aren't the droids you're looking for.";
        String who = "\nWho said it? ";
        String obi = " Obi-Wan Kenobi";
        String says = "\nObi-Wan Kenobi says, ";
        String looking = "\"These aren't the droids\n" +
                "    you're looking for.\"";
        sentence = whatIsThe + these + who + obi + says + looking;
        System.out.println(sentence);

        Scanner input = new Scanner(System.in);

        String noun= "Dog";
        String verb = "Walking";
        String adjective = "Blue";
        String adverb = "quickly";
        String story = " Do you " +verb+  " your " +adjective+noun+adverb+ "? That's hilarious! ";
        System.out.println(story);

        input.close();

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

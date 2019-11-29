package org.FastTrackIt;
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



    }


}

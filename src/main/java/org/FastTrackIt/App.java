package org.FastTrackIt;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

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


        System.out.println("What is the word you want to measure?");
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

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " +  adverb + " That's hilarious!");

        double first,second;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("What is your first number? ");
        first=keyboard.nextDouble();
        System.out.print("What is your second number? ");
        second=keyboard.nextDouble();
        double result = first + second;
        System.out.println(first + second);
        double result1 = first / second;
        System.out.println(first/second);
        double result2 = first * second;
        System.out.println(first*second);


        int currentAge,retireAge;

        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("What is your current age? ");
        currentAge=keyboard.nextInt();
        System.out.print("At what age would you like to retire? ");
        retireAge=keyboard.nextInt();
        result = retireAge-currentAge;
        System.out.println("You have " +result+ " years left until you can retire. ");
        int thisYear= Calendar.getInstance().get(Calendar.YEAR);
        result = thisYear+ retireAge-currentAge;
        System.out.println("It's" + thisYear + "so you can retire in " + result );




//        Scanner scanner1 = new Scanner(System.in);

//        System.out.println("What is the length of the room in feet? :");
//        double length = scanner.nextDouble();
//        System.out.println("What is the width of the room in feet? :");
//        double width = scanner.nextDouble();
//        double area = length * width;
//        System.out.println("The area is:" + area);
//





    }



}

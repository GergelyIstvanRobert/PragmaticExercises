package inputprocessingoutput2;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name1;
        Scanner sc = new Scanner(System.in);
        name1 = sc.nextLine();
        System.out.println("You have a car?");
        String car;
        car = sc.nextLine();
        System.out.println("what car do you have?");
        String what =sc.nextLine();

        System.out.println(name1 +" said, " +  car + " I have a car a "+ what);








    }







}

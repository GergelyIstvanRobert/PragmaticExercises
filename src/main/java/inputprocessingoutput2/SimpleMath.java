package inputprocessingoutput2;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args)
    {
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

    }

}


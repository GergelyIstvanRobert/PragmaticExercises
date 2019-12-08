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

        System.out.println("("+first+"+"+second+") /2 is ..."+((first+second)/2));
    }

}


package inputprocessingoutput2;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args, int result){
        int currentAge,retireAge;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("What is your current age? ");
        currentAge=keyboard1.nextInt();
        System.out.print("At what age would you like to retire? ");
        retireAge=keyboard1.nextInt();
        result = retireAge-currentAge;
        System.out.println("You have " +result+ " years left until you can retire. ");
        int thisYear= Calendar.getInstance().get(Calendar.YEAR);
        result = thisYear+ retireAge-currentAge;
        System.out.println("It's" + thisYear + "so you can retire in " + result );

    }


}

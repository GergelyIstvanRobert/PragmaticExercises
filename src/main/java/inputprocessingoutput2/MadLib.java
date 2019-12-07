package inputprocessingoutput2;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a noun :");
        String noun = keyboardInput.nextLine();
        System.out.println("Enter a verb :");
        String verb = keyboardInput.nextLine();
        System.out.println("Enter a adjective :");
        String adjective = keyboardInput.nextLine();
        System.out.println("Enter a adverb :");
        String adverb = keyboardInput.nextLine();
        System.out.println("Do you " + verb + "your " + adjective + noun + adverb + " That's hilarious! ");





    }




}

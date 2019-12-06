package inputprocessingoutput2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        String s = "Homer";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homer has " + s.length() + " characters.");
    }


}

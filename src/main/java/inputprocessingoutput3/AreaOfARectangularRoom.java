package inputprocessingoutput3;

import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? :");
        double length = scanner.nextDouble();
        System.out.println("What is the width of the room in feet? :");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of Rectangle is:" + area);
    }
}

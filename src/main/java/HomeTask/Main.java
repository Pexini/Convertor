package HomeTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter unit of measurement F or C :");
        String measure = scanner.next();
        System.out.println("Please enter unit of number of degrees :");
        double number = scanner.nextDouble();
        double result = 0;
        if (measure.equals("F")) {
            result = (number - 32) / 1.8;
        } else {
            if (measure.equals("C")) {
                result = number + 273;
            }else {
                System.out.println( "Error unit of measurement");
            }
        }
        System.out.println("Result " + result);
    }
}
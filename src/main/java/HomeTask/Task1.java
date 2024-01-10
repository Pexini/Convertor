package HomeTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your age : ");
        int age = scanner.nextInt();
        int result = 0;
        if (age < 0) {
            System.out.println("Your not born yet");
        } else {
            if (age % 10 == 1) {
                System.out.println(" Your " + age + " год");
            } else {
                if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
                    System.out.println(" Your " + age + " года");
                } else {
                    System.out.println(" Your " + age + " лет");
                }
            }
        }
    }
}

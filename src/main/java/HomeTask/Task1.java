package HomeTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your age : ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Your not born yet");
        }
        if (age % 100 >= 11 && age % 100 <= 19) {
            System.out.println(" Your " + age + " лет");
            return;
        }
        if (age % 10 == 1) {
            System.out.println(" Your " + age + " год");
        }
        if (age % 10 >= 2 && age % 10 <= 4) {
            System.out.println(" Your " + age + " года");
        }
        if (age % 10 == 0 || age % 10 >= 5 && age % 10 <= 9) {
            System.out.println(" Your " + age + " лет");
        }
    }
}



package Lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numberOk = false;
        int num = 0;

        while (!numberOk){
            System.out.println("Enter number");
            String userInput = scanner.nextLine();

            try {
                num = Integer.parseInt(userInput);
                numberOk = true;
            } catch (NumberFormatException e){
                System.out.println("Invalid Input. Numbers only");
            }
        }
        System.out.println("Yoe entered number " + num);
    }
}

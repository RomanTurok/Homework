package Lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n1 = sc.nextInt();
        int squareNumber = n1 * n1;
        System.out.println(squareNumber);
        if (n1 < 0){
            throw new NegativeNumberException();
        }
    }
}

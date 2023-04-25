package Lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {

        try {
            squareNumbers();
        } catch (NegativeNumberException e){
            e.printStackTrace();
        }
    }

    private static int squareNumbers() throws NegativeNumberException{
        int res = 0;
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        res = scanner.nextInt();
        if (res < 0){
            throw new NegativeNumberException("Number cant be negative");
        }
        res = res * res;
        System.out.println(res);

        return res;
    }
}

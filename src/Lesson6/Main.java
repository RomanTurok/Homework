package Lesson6;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int j = 0; j < 101; j+=2) {
            System.out.print(j + " ");
        }
        System.out.println();


        int fact = 1;
        int number = 7;
        for (int i = 1; i <=7; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);






    }
}

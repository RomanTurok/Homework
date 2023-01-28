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
        System.out.print("Factorial of " + number + " is " + fact);
        System.out.println();

        int n = 100;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Numbers Upto " + n +  ": ");

        while (a <= n){
            System.out.print(a + ", ");

            int d = a + b;
            a = b;
            b = d;
        }








    }
}

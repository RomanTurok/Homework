package Lesson5;

public class Main {
    public static void main(String[] args) {

        int number = 12;

        if (number > 5) {
            System.out.println(number + " > 5");
        }
        if (number < 5) {
            System.out.println(number + " < 5");
        }


        if (number > 10) {
            System.out.println(number + " > 10");
        } else {
            System.out.println(number + " < 10");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }
}

package Lesson7;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        a = cubeNumber(a);
        System.out.println(a);

        printNumberOfStars(25);
        printSomeSymbolTimes(20, " £ ");

    }
    static int cubeNumber (int cube){
        return  cube * cube * cube;
    }

    static void printNumberOfStars (int star){
        for (int i = 0; i < star; i++) {
            System.out.print( " * ");
        }
        System.out.println();
    }
    static void printSomeSymbolTimes(int number, String symbol){
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}

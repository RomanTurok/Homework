package Lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];

        fillArrayRandomNumbers(arr, 10);
        printArray(arr);
        int getMinArrayValue = getMinArrayValue(arr);
        System.out.println(getMinArrayValue(arr));

        int getMaxArrayValue = getMaxArrayValue(arr);
        System.out.println(getMaxArrayValue);

        double getAverageArrayValue = getAverageArrayValue(arr);
        System.out.println(getAverageArrayValue);

        int getTotalArrayNumbersValue = getTotalArrayNumbersValue(arr);
        System.out.println(getTotalArrayNumbersValue);

    }

    static void fillArrayRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
    }

    static int getMinArrayValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int getMaxArrayValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double getAverageArrayValue(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    static int getTotalArrayNumbersValue(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

}

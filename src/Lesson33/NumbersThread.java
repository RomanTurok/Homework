package Lesson33;

import java.util.Random;

public class NumbersThread extends Thread{
    private Random random;
    public NumbersThread() {
        this.random = new Random();
    }
    @Override
    public void run() {
        while (true){
            int number = random.nextInt(10);
            System.out.println(number);
            if (number == 5){
                break;
            }
        }
    }
}

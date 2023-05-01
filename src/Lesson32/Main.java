package Lesson32;

public class Main {
    public static void main(String[] args) {
        ThreatRunnable threatRunnable = new ThreatRunnable();

        Thread thread0 = new Thread(threatRunnable);
        Thread thread1 = new Thread(threatRunnable);

        thread0.start();
        thread1.start();
    }
}

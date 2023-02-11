package Lesson15;

public class Driver implements Drive, Drinkable {

    @Override
    public void drive() {
        System.out.println("Driver" + " I`m Driving");
    }

    @Override
    public void drink() {
        System.out.println("Driver" + " I drink");
    }
}

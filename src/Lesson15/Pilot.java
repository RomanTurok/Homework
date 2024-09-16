package Lesson15;

public class Pilot implements Fly, Drive, Drinkable{

    @Override
    public void fly() {
        System.out.println("Pilot" + "  I`m Flying");
    }
    @Override
    public void drive() {
        System.out.println("Pilot" + "  I can drive");

    }
    @Override
    public void drink() {
        System.out.println("Pilot" + "  I drink");
    }
}

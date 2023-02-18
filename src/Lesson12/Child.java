package Lesson12;

public class Child extends Parent {

    protected String fullName;
    protected String hobby;
    protected int age;

    static {
        System.out.println("Child St 2");
    }
    static {
        System.out.println("Child Sy 2.1");
    }

    {
        System.out.println("Child block 2");
    }
    {
        System.out.println("Child block 2.1");
    }

    public Child() {
        System.out.println("Child Constructor");

    }
}

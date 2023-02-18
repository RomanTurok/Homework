package Lesson12;

public class Parent {
    protected String fullName;
    protected String occupation;
    protected int age;

    static {
        System.out.println("Parent St 1");
    }
    static {
        System.out.println("Parent St 1.2");
    }

    {
        System.out.println("Parent block 1");
    }
    {
        System.out.println("Parent block 1.1");
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }
}

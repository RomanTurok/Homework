package Lesson18;

import java.util.*;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(10);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        System.out.println(l1);
        System.out.println();



        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1000000);
        System.out.println(l2);
        System.out.println();



        Student s1 = new Student("Ivan", "Mokrii", 21);
        Student s2 = new Student("Roman", "Temnuy", 20);
        Student s3 = new Student("Kateryna", "Mokra", 19);
        Student s4 = new Student("Emma", "Turok", 20);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Set<Student> list = Set.of(s1, s2, s3, s4);
        Iterator<Student> ii = students.iterator();
        while (ii.hasNext()) {
            Student i = ii.next();
            System.out.println(i);
        }
    }
}


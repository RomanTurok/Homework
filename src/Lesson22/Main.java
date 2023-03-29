package Lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();

        student.add(new Students("Mokra", 155));
        student.add(new Students("Bereza", 140));
        student.add(new Students("Lusuy", 160));
        student.add(new Students("Dub", 123));

        student.forEach(System.out :: println);
        System.out.println();
//
//
        student.sort((Students o1, Students o2) -> o1.getAverageScore()- o2.getAverageScore());
        student.forEach(System.out::println);
        System.out.println();


        Comparator<Students> bySurname =
                (Students o1, Students o2) -> o1.getSurname().compareTo(o2.getSurname());
        student.forEach(System.out::println);
        System.out.println();


        Comparator<Students> comp = (o1, o2) -> {
            return o1.getSurname().compareTo(o2.getSurname());
        };
        student.forEach(System.out::println);
        System.out.println();

        Comparator<Students> surNameComparator = Comparator.comparing(Students::getSurname);
        student.forEach(System.out :: println);
    }
}

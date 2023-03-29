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
        student.add(new Students("Dub", 125));

        student.forEach(System.out :: println);
        System.out.println();
//
//
        student.sort((Students o1, Students o2) -> o1.getAverageScore()- o2.getAverageScore());
        student.forEach(System.out::println);
        System.out.println();
//
//

    }
}

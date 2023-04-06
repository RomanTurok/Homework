package Lesson23;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(5, 3, 7, 25, 45, 16, 36, 78);

        int sum = l1.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println(sum);
        System.out.println();




        List<NameList> l2 = List.of(
                new NameList("Mokra"),
                new NameList("Zebra"),
                new NameList("Tank"),
                new NameList("Bereza"),
                new NameList("Ivanko"),
                new NameList("Babay"),
                new NameList("Bereza"),
                new NameList("Mokra"),
                new NameList("Zebra"),
                new NameList("Zebra"),
                new NameList("Bereza"),
                new NameList("Tank"),
                new NameList("Tank"),
                new NameList("Ivanko"),
                new NameList("Babay"),
                new NameList("Tank"),
                new NameList("Mokra"),
                new NameList("Babay"),
                new NameList("Tank"),
                new NameList("Zebra")
        );
//


        Map<String, List<NameList>> result = l2.stream()
                .collect(Collectors.groupingBy(NameList::getSurname));

        System.out.println(result);



        List<Names> l3 = List.of(
                new Names("Mokra",1),
                new Names("Kaban",1),
                new Names("Zebra",1),
                new Names("Kit",1),
                new Names("Kit",1),
                new Names("Zebra",1),
                new Names("Mokra",1),
                new Names("Kaban",1),
                new Names("Mokra",1),
                new Names("Kaban",1),
                new Names("Mokra",1),
                new Names("Tank",1),
                new Names("Tank",1),
                new Names("Tank",1),
                new Names("Mokra",1),
                new Names("Tank",1),
                new Names("Tank",1),
                new Names("Tank",1),
                new Names("Kit",1),
                new Names("Kit",1)
        );

        System.out.println();

        Map<String, Long> res = l3.stream()
                .collect(Collectors.groupingBy(Names::getSurname, Collectors.summingLong(Names::getRepeat)));

        System.out.println(res);

    }
}

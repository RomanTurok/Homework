package Lesson17;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        System.out.println(dayOfWeek);

        for (DayOfWeek value : DayOfWeek.values()){
            System.out.println(value + " " + value.getNumber());
        }

    }
}

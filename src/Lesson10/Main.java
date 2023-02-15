package Lesson10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setCourse("Management");
        student.setDateOfBirth(1/3/2016);
        student.setYear(1);

        System.out.println(student);


        Teacher teacher = new Teacher();
        teacher.setFullName("Mokra Galyna Petrivna");
        teacher.setYearsOfPractice(5);
        teacher.setScienceDegree("Doctor Degree in Management");

        System.out.println(teacher);


    }
}

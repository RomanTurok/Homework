package Lesson10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivamov Ivan Ivanovich", "Management", 1/3/2016, 1);
        System.out.println(student);


        Teacher teacher = new Teacher("Mokra Galyna Petrivna", "Doctor Degree of Management",5);
        System.out.println(teacher);

        Array array1 = new Array();
        int[] array = array1.greatRandomArray(10);
        array1.printArray(array);
        array1.sortArrayMax(array);
        array1.printArray(array);
        array1.sortArrayMin(array);
        array1.printArray(array);









    }
}

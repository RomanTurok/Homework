package Lesson10;

public class Student {

    private String fullName;
    private String course;
    private int dateOfBirth;
    private int yearOfStudy;

    public Student() {
    }

    public Student(String fullName, String course, int dateOfBirth, int yearOfStudy) {
        this.fullName = fullName;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
        this.yearOfStudy = yearOfStudy;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYear() {
        return yearOfStudy;
    }

    public void setYear(int year) {
        this.yearOfStudy = year;
    }

    public void study(){
        System.out.println("I`m Studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course='" + course + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}

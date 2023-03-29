package Lesson22;

public class Students {
    private String surname;
    private int averageScore;
    public String getSurname() {
        return surname;
    }
    public int getAverageScore() {
        return averageScore;
    }
    public Students(String surname, int averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;

    }
    @Override
    public String toString() {
        return "Students{" +
                "surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

package Lesson23;

public class NameList {

    public String surname;

    public NameList(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "NameList{" +
                "surname='" + surname + '\'' +
                '}';
    }
}

package Lesson23;

public class Names {

    private String surname;
    private long repeat;

    public Names(String surname, long repeat) {
        this.surname = surname;
        this.repeat = repeat;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getRepeat() {
        return repeat;
    }

    public void setRepeat(long repeat) {
        this.repeat = repeat;

    }

    @Override
    public String toString() {
        return "Names{" +
                "surname='" + surname + '\'' +
                ", repeat=" + repeat +
                '}';
    }
}

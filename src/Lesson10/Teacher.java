package Lesson10;

public class Teacher {

    private String fullName;
    private String scienceDegree;
    private int yearsOfPractice;

    public Teacher() {
    }

    public Teacher(String fullName, String scienceDegree, int yearsOfPractice) {
        this.fullName = fullName;
        this.scienceDegree = scienceDegree;
        this.yearsOfPractice = yearsOfPractice;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getScienceDegree() {
        return scienceDegree;
    }

    public void setScienceDegree(String scienceDegree) {
        this.scienceDegree = scienceDegree;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    public void teach (){
        System.out.println("I`m Teaching");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", scienceDegree='" + scienceDegree + '\'' +
                ", yearsOfPractice=" + yearsOfPractice +
                '}';
    }
}

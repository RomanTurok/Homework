package Lesson14;

public class Student extends Human {

    public String name;
    public String surName;
    public int dateOfBirth;
    public int taxNumber;

    public Student() {
    }

    public Student(String name, String surName, int dateOfBirth, int taxNumber) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String surName() {
        return surName;
    }

    @Override
    public int dateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int taxNumber() {
        return taxNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", taxNumber=" + taxNumber +
                '}';
    }
}



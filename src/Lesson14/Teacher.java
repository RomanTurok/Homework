package Lesson14;

public class Teacher extends Human {

    public String name;
    public String surName;
    public int daneOfBirth;
    public int taxNumber;

    public Teacher() {
    }

    public Teacher(String name, String surName, int daneOfBirth, int taxNumber) {
        this.name = name;
        this.surName = surName;
        this.daneOfBirth = daneOfBirth;
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

    public int getDaneOfBirth() {
        return daneOfBirth;
    }

    public void setDaneOfBirth(int daneOfBirth) {
        this.daneOfBirth = daneOfBirth;
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
        return daneOfBirth;
    }

    @Override
    public int taxNumber() {
        return taxNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", daneOfBirth=" + daneOfBirth +
                ", taxNumber=" + taxNumber +
                '}';
    }
}

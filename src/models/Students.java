package models;

public class Students {

    String name;
    int age;
    int rollno;
    double fees;
    String section;

    public Students(String name, int age, int rollno, double fees, String section) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.fees = fees;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

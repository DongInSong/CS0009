package asgmt_5_2;

public class Student {
    private int id;
    private String name;
    private char Gender;
    private String major;
    private String course;

    public void setGender(char Gender){
        this.Gender = Gender;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public Student(String name){
        id = nextNumber();
        this.name = name;
    }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }

    public void show() {
        System.out.println("***************************");
        System.out.println("학생ID: " + id +
                "\n학생이름: " + name +
                "\n성별: " + Gender +
                "\n전공: " + major +
                "\n교과과정: " + course);
        System.out.println("***************************");
    }
}

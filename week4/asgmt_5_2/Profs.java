package asgmt_5_2;

public class Profs {
    private int id;
    private String name;
    private char Gender;
    private String major;
    private String Lab;

    public void setGender(char Gender){
        this.Gender = Gender;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setLab(String Lab){
        this.Lab = Lab;
    }

    public Profs(String name){
        id = nextNumber();
        this.name = name;
    }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }

    public void show() {
        System.out.println("***************************");
        System.out.println("교수ID: " + id +
                "\n교수이름: " + name +
                "\n성별: " + Gender +
                "\n전공: " + major +
                "\n연구실: " + Lab);
        System.out.println("***************************");
    }
}

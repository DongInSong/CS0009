package _7_20_stud;

public class Stud {
    String name;
    double sub1;
    double sub2;
    double sub3;

    public Stud(String name, double sub1, double sub2, double sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

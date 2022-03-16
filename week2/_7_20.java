import java.text.DecimalFormat;

public class _7_20 { // 성적 처리 프로그램
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".##");

        Stud st[] = new Stud[4];
        st[0] = new Stud("Betty", 65.0, 98.0, 80.0);
        st[1] = new Stud("John", 98.0, 89.0, 72.0);
        st[2] = new Stud("Billy", 78.0, 76.0, 92.0);
        st[3] = new Stud("Helen", 98.0, 77.0, 91.0);
        for (int i = 0; i < 4; i++) {
            System.out.println(st[i].getName() + " " + df2.format(st[i].getAverage()));
        }
    }

    static public class Stud {
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
}

package asgmt_5_2;

public class Subject {
    private String name; // 과목명
    private int[] credit = new int[4]; // 학점 0-0-0-0
    private String code; // 과목코드
    private int semester; // 학기
    private int grade; // 학년
    private String major; // 이수구분

    public void setData(int grade, int semester, String code,
            String name, int[] credit, String major) {
        this.name = name;
        this.credit = credit;
        this.code = code;
        this.semester = semester;
        this.grade = grade;
        this.major = major;
    }

    private String getCredit() {
        String cd = "";
        for (int i = 0; i < 4; i++) {
            cd += credit[i];
            if (i < 3) {
                cd += "-";
            }
        }
        return cd;
    }

    public void show(){
        System.out.printf("%2d   |  %d   | %-4s   | %-6s   | %-8s| %-6s\n",
        grade, semester, major, code, name, getCredit());
    }

    // public void show() {
    //     System.out.println("교과목명: " + name +
    //             "\n과목코드: " + code +
    //             "\n학점: " + getCredit() +
    //             "\n학년: " + grade +
    //             "\n학기: " + semester +
    //             "\n전공: " + major);
    // }
}

package asgmt_5_2;

public class DB {
    // 1학년 1학기 ~ 2학년 2학기 객체 배열 선언
    public Subject sub = new Subject();
    public Subject[] subjects_1_1;
    public Subject[] subjects_1_2;
    public Subject[] subjects_2_1;
    public Subject[] subjects_2_2;

    public void DB_1_1() { // 1학년 1학기
        subjects_1_1 = new Subject[5];
        for (int i = 0; i < subjects_1_1.length; i++) { // 객체 배열 생성
            subjects_1_1[i] = new Subject();
        }

        int[] FP0001 = { 0, 0, 0, 0 };
        int[] CS0060 = { 3, 2, 0, 2 };
        int[] CS0007 = { 2, 0, 2, 0 };
        int[] CS0061 = { 3, 3, 0, 0 };
        int[] CS0062 = { 1, 0, 0, 2 };
        subjects_1_1[0].setData(1, 1, "FP0001", "지도교수상담      ", FP0001, "전선");
        subjects_1_1[1].setData(1, 1, "CS0060", "프로그래밍입문⠀   ", CS0060, "전필");
        subjects_1_1[2].setData(1, 1, "CS0007", "창의공학설계입문  ", CS0007, "전필");
        subjects_1_1[3].setData(1, 1, "CS0061", "컴퓨터개론        ", CS0061, "전선");
        subjects_1_1[4].setData(1, 1, "CS0062", "학습과진로        ", CS0062, "전선");
    }

    public void DB_1_2() { // 1학년 2학기
        subjects_1_2 = new Subject[4];
        for (int i = 0; i < subjects_1_2.length; i++) { // 객체 배열 생성
            subjects_1_2[i] = new Subject();
        }
        int[] FP0001 = { 0, 0, 0, 0 };
        int[] CS0010 = { 3, 2, 0, 2 };
        int[] CS0005 = { 3, 2, 0, 2 };
        int[] CS0063 = { 2, 2, 0, 0 };
        subjects_1_2[0].setData(1, 2, "FP0001", "지도교수상담      ", FP0001, "전선");
        subjects_1_2[1].setData(1, 2, "CS0010", "자바프로그래밍⠀   ", CS0010, "전필");
        subjects_1_2[2].setData(1, 2, "CS0005", "논리회로          ", CS0005, "전필");
        subjects_1_2[3].setData(1, 2, "CS0063", "멀티미디어        ", CS0063, "전선");
    }

    public void DB_2_1() { // 2학년 1학기
        subjects_2_1 = new Subject[4];
        for (int i = 0; i < subjects_2_1.length; i++) { // 객체 배열 생성
            subjects_2_1[i] = new Subject();
        }
        int[] CS0064 = { 4, 4, 0, 0 };
        int[] CS0011 = { 3, 3, 0, 0 };
        int[] CS0012 = { 4, 4, 0, 0 };
        int[] CS0009 = { 2, 0, 2, 0 };
        subjects_2_1[0].setData(2, 1, "CS0064", "자료구조          ", CS0064, "전필");
        subjects_2_1[1].setData(2, 1, "CS0011", "컴퓨터구조        ", CS0011, "전필");
        subjects_2_1[2].setData(2, 1, "CS0012", "데이터베이스      ", CS0012, "전필");
        subjects_2_1[3].setData(2, 1, "CS0009", "프로그래밍응용    ", CS0009, "전필");
    }

    public void DB_2_2() { // 2학년 1학기
        subjects_2_2 = new Subject[5];
        for (int i = 0; i < subjects_2_2.length; i++) { // 객체 배열 생성
            subjects_2_2[i] = new Subject();
        }
        int[] CS0077 = { 3,2,0,2};
        int[] CS0017 = { 3, 3, 0, 0 };
        int[] CS0016 = { 4, 4, 0, 0 };
        int[] CS0069 = { 2, 0, 2, 0 };
        int[] CS0080 = { 2, 1, 0, 2 };
        subjects_2_2[0].setData(2, 2, "CS0077", "C++프로그래밍     ", CS0077, "전필");
        subjects_2_2[1].setData(2, 2, "CS0017", "운영체제          ", CS0017, "전필");
        subjects_2_2[2].setData(2, 2, "CS0016", "컴퓨터네트워크    ", CS0016, "전필");
        subjects_2_2[3].setData(2, 2, "CS0069", "융합프로젝트      ", CS0069, "전필");
        subjects_2_2[4].setData(2, 2, "CS0080", "오픈소스소프트웨어", CS0080, "전선");
    }

    public void show_1_1() {
        System.out.printf("%s | %s | %-4s | %-4s | %-10s    | %-2s\n",
                "학년", "학기", "이수구분", "과목코드", "교과목명", "학점");
        for (int i = 0; i < subjects_1_1.length; i++) {
            subjects_1_1[i].show();
            
        }
    }

    public void show_1_2() {
        System.out.printf("%s | %s | %-4s | %-4s | %-10s    | %-2s\n",
                "학년", "학기", "이수구분", "과목코드", "교과목명", "학점");
        for (int i = 0; i < subjects_1_2.length; i++) {
            subjects_1_2[i].show();
        }
    }

    public void show_2_1() {
        System.out.printf("%s | %s | %-4s | %-4s | %-10s    | %-2s\n",
                "학년", "학기", "이수구분", "과목코드", "교과목명", "학점");
        for (int i = 0; i < subjects_2_1.length; i++) {
            subjects_2_1[i].show();
        }
    }

    public void show_2_2() {
        System.out.printf("%s | %s | %-4s | %-4s | %-10s    | %-2s\n",
                "학년", "학기", "이수구분", "과목코드", "교과목명", "학점");
        for (int i = 0; i < subjects_2_2.length; i++) {
            subjects_2_2[i].show();
        }
    }
}

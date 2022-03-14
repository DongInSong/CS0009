package ch4;

import java.util.Scanner;

public class G_switch { // 성적 계산기
    public static void main(String[] args) {
        int score;
        char grade = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.print("Input score ? ");
        score = sc.nextInt();
        score /= 10; // 일의 자리 불필요
        switch (score) {
            case 10, 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Grade = " + grade);
        sc.close();
    }
}

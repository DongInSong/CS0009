package ch4;

import java.util.Scanner;

public class G_if { // 성적 계산기
    public static void main(String[] args) {
        int score;
        char grade = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.print("Input score ? ");
        score = sc.nextInt();
        score /= 10; // 일의 자리 불필요
        if (score >= 9) {
            grade = 'A';
        } else if (score >= 8) {
            grade = 'B';
        } else if (score >= 7) {
            grade = 'C';
        } else if (score >= 6) {
            grade = 'D';
        } else
            grade = 'F';
        System.out.println("Grade = " + grade);
        sc.close();
    }
}

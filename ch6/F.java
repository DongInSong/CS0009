package ch6;

import java.util.Scanner;

public class F { // 절대값 계산

    public static int abs(int a) {
        if(a>0) return a; // 이미 양수면 그대로 리턴
        return a*(-1); // 음수*-1 하면 양수로 변환 = 절대값
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        num = sc.nextInt();
        System.out.println("숫자 " + num +"의 절대값은 "+abs(num)+"입니다."); // 출력 후 줄바꿈
        sc.close();
    }
}
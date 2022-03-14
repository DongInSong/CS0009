package ch6;

import java.util.Scanner;

public class B { // Factorial 계산

    public static int facto(int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        num = sc.nextInt();
        System.out.println("결과: " + facto(num)); // 출력 후 줄바꿈
        sc.close();
    }
}
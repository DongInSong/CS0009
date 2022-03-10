package ch6;

import java.util.Scanner;

public class A {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수 입력: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("두 정수의 합: " + sum(num1, num2)); // 출력 후 줄바꿈
        sc.close();
    }
}
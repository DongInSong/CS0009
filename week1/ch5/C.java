package ch5;

import java.util.Scanner;

public class C { // 덧셈 연산자를 이용한 곱셈 연산
    public static void main(String[] args) {
        int num1, num2, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        for (int i = 0; i < num2; i++) { // num2 수만큼 반복
            sum += num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + sum);
        sc.close();
    }
}
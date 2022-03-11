package ch5;

import java.util.Scanner;

public class D { // 뺄셈 연산자를 이용한 나머지 연산
    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        temp = num1;
        while ((temp - num2) >= 0) {
            temp -= num2;
        }
        System.out.println(num1 + " % " + num2 + " = " + temp);
        sc.close();
    }
}
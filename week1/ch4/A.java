package ch4;

import java.util.Scanner;

public class A { // 정수 숫자 크기 비교
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else
            System.out.println(num1 + " is less than " + num2);
        sc.close();
    }
}
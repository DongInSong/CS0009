package ch5;

import java.util.Scanner;

public class B { // 두 숫자 사이의 정수 합 계산기
    public static void main(String[] args) {
        int num1, num2, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        if (num1 < num2) { // 2가 1보다 크면 교환
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        for (int i = num2; i <= num1; i++) { // num2에서 num1까지 반복
            sum += i;

        }
        System.out.println("작은 수부터 큰 수까지의 합: " + sum);
        sc.close();
    }
}
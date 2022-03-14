package ch5;

import java.util.Scanner;

public class K { // 홀수 합 계산
    public static void main(String[] args) {
        int num1, num2, temp = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        if (num2 < num1) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if (num1 >= 0 && num2 >= 0) {
            System.out.print("Odd Numer : ");
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 1) {
                    System.out.print(i);
                    sum += i;
                    if (i < num2 - 1) {
                        System.out.print(", ");
                    } else
                        System.out.println();
                }
            }
            System.out.println("Odd sum from min odd to max odd : " + sum);
        } else
            System.out.println("Exception");
        sc.close();
    }
}

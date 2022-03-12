package ch5;

import java.util.Scanner;

public class L { // 사각형 테두리 출력
    public static void main(String[] args) {
        int num, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ? ");
        num = sc.nextInt();
        sc.close();
        for (j = 0; j < num; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (i = num - 2; i > 0; i--) {
            System.out.print("*");
            for (j = 0; j < num - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (j = 0; j < num; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

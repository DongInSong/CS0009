package ch5;

import java.util.Scanner;

public class M { // 다이아몬드 도형 출력
    public static void main(String[] args) {
        int num, i, j, k;
        Scanner sc = new Scanner(System.in);
        while (true) { // 홀수만 입력
            System.out.print("Input number ? ");
            num = sc.nextInt();
            if (num % 2 == 1) {
                for (i = 0; i < (num / 2) + 1; i++) {
                    for (j = i; j < (num / 2) + 1; j++) {
                        System.out.print(" ");
                    }
                    for (k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (i = (num / 2); i > 0; i--) {
                    for (j = i; j <= (num / 2) + 1; j++) {
                        System.out.print(" ");
                    }
                    for (k = 0; k <= (i - 1) * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        }
        sc.close();
    }
}

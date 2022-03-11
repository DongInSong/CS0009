package ch3;

import java.util.Scanner;

public class F { // 원의 면적과 둘레 계산
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        r = sc.nextInt();
        double PI = 3.14;
        double area = PI * r * r;
        double peri = 2 * PI * r;
        System.out.println("면적: " + area + " 둘레: " + peri);

        sc.close();

    }
}
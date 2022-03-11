package ch3;

import java.util.Scanner;

public class B { // 2차 다항식 계산
    public static void main(String[] args) {
        double y, a, b, c, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("2차 다항식: y = a*x 2 + b*x + c");
        System.out.print("계수 및 x 입력 (a, b, c, x): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        y = (a * (Math.pow(x, 2))) + (b * x) + c;
        System.out.println("게산 결과 (y): " + y);
        sc.close();

    }
}
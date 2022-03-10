package ch6;

import java.util.Scanner;

public class D {

    public static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x1-x2, 2))+(Math.pow(y1-y2, 2)));
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 좌표(x, y) 입력: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("두 번째 좌표(x, y) 입력: ");
        x2 = sc.nextInt();
        y2=sc.nextInt();
        System.out.println("두 좌표거리: " + dist(x1, y1, x2, y2)); // 출력 후 줄바꿈
        sc.close();
    }
}
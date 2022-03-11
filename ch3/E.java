package ch3;

import java.util.Scanner;

public class E { // 시, 분, 초 변환
    public static void main(String[] args) {
        int sec, min, hour;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        sec = sc.nextInt();

        min = sec / 60;
        sec = sec % 60;

        hour = min / 60;
        min = min % 60;

        System.out.println(hour + "시 " + min + "분 " + sec + "초 ");
        sc.close();

    }
}
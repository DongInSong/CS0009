package ch5;

import java.util.Scanner;

public class F { // 최소, 최대, 평균 계산
    public static void main(String[] args) {
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, avg = 0, cnt = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input number ? ");
            while (true) {
                num = sc.nextInt();
                if (num >= 0 || num == -1) {
                    break;
                } else
                    System.out.print("음수입니다. 다시 입력하세요 : ");
            }
            if (num == -1) {
                break;
            }

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            avg += num;
            cnt++;
        }
        System.out.println("최솟값 : " + min);
        System.out.println("최댓값 : " + max);
        System.out.println("평균값 : " + (double) avg / cnt);
        sc.close();
    }

}

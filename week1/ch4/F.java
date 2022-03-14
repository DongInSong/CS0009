package ch4;

import java.util.Scanner;

public class F { // 대소문자 판별 및 변환;
    public static void main(String[] args) {
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Character ? ");
        ch = sc.next();
        boolean upper = ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z';
        boolean Lower = ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z';
        if (upper) {
            System.out.println(ch + "는 대문자");
            System.out.println(ch + "의 소문자는 " + (char) (ch.charAt(0) + 32));
        } else if (Lower) {
            System.out.println(ch + "는 소문자");
            System.out.println(ch + "의 대문자는 " + (char) (ch.charAt(0) - 32));
        } else
            System.out.println(Integer.parseInt(ch) + "(은)는 문자가 아님"); // 정수 입력 시 문자열로 변환
        sc.close();
    }

}

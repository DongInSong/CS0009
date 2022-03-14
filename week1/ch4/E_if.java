package ch4;

import java.util.Scanner;

public class E_if { // 자음 및 모음 판별기
    public static void main(String[] args) {
        String ch, ch2;
        boolean isVow = false;
        String[] vow = { "a", "e", "i", "o", "u" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Character ? ");
        ch = sc.next().toLowerCase();
        for (int i = 0; i < vow.length; i++) {
            ch2 = vow[i];
            if (ch.equals(ch2)) {
                isVow = true;
            }
        }
        if (isVow)
            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is Consonant");

        sc.close();
    }

}

package ch5;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int num, length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ? ");
        num = sc.nextInt();
        length = (int)Math.log10(num)+1; //int형 정수 자리수
        for(int i = 0; i<length; i++){
            System.out.print(num%10+" ");
            num /=10;
        }
        System.out.println(); //출력 후 줄바꿈
        sc.close();
    }
}
package ch3;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        r=sc.nextInt();
        double PI = 3.14;
        double result =PI*r*r;
        System.out.println(result);

        sc.close();
       
    }
}
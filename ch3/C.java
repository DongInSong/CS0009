package ch3;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        num=sc.nextInt();
        if(num < 0 || num > 25){
            System.out.println("error");
        }
        else
        {
            System.out.println(String.format("%c", (char)num+97));

        }
        sc.close();

    }
}
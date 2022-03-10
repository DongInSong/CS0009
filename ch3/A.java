package ch3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        num1 = sc.nextInt();
        System.out.print("num2: ");
        num2 = sc.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        if (num2 == 0){
            System.out.println("Can't be divided by 0"); sc.close(); return;
        }
        else{
        System.out.println(num1 + "/" + num2 + "=" + (String.format("%.1f", (float)num1 / (float)num2)));
        }
        System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
        sc.close();

    }
}
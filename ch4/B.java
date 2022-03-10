package ch4;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ? ");
        num = sc.nextInt();
        temp = num % 2;
        if (temp > 0) {
            System.out.println(num + " is odd number");
        } else
            System.out.println(num + " is even number");
        sc.close();
    }

}

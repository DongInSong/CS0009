package ch4;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int num1, num2, temp;
        String oper;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input equation ? ");
        num1 = sc.nextInt();
        oper = sc.next();
        num2 = sc.nextInt();
        if (oper.equals("+")) {
            temp = num1 + num2;
            System.out.println(num1 + oper + num2 + "=" + temp);
        } else if (oper.equals("-")) {
            temp = num1 - num2;
            System.out.println(num1 + oper + num2 + "=" + temp);
        } else if (oper.equals("*")) {
            temp = num1 * num2;
            System.out.println(num1 + oper + num2 + "=" + temp);
        } else if (oper.equals("/")) {
            if (num2 != 0) {
                temp = num1 / num2;
                System.out.println(num1 + oper + num2 + "=" + temp);
            } else
                System.out.println("Can't Divided by 0"); // 예외처리
        } else
            System.out.println("Exeption"); // 예외처리
        sc.close();
    }

}

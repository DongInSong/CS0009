package ch5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E { // 사칙 연산
    public static void main(String[] args) {
        double num1, num2, temp = 0;
        String oper, YorN;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        while (true) {
            System.out.print("Input equation ? ");
            num1 = sc.nextInt();
            oper = sc.next();
            num2 = sc.nextInt();
            if (oper.equals("+")) {
                temp = num1 + num2;
            } else if (oper.equals("-")) {
                temp = num1 - num2;
            } else if (oper.equals("*")) {
                temp = num1 * num2;
            } else if (oper.equals("/")) {
                if (num2 != 0) {
                    temp = num1 / num2;
                } else
                    System.out.println("Can't Divided by 0"); // 예외처리
            } else {
                System.out.println("Exeption"); // 예외처리
            }
            System.out.println(df.format(num1) + " " + oper + " " + df.format(num2) + " = " + df.format(temp));
            System.out.println("반복 수행? (Yes/No)");
            YorN = sc.next();
            if (YorN.equals("No"))
                break;
            else if (YorN.equals("Yes"))
                continue;
            else
                System.out.println("Exeption");
        }
        sc.close();
    }

}

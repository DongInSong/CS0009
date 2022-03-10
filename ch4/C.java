package ch4;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ? ");
        num = sc.nextInt();
        temp = num % 2;
        if (temp == 1 || temp == -1) { // 양수 홀수 ==1, 음수 홀수 ==2
            if (num >= 0) {
                System.out.println(num + " is Odd and Positive number");
            } else
                System.out.println(num + " is Odd and Negative number");
        } else if(temp ==0) {
            if (num >= 0) {
                System.out.println(num + " is Even and Positive number");
            } else
                System.out.println(num + " is Even and Negative number");
        }
        else
        System.out.println("Exeption"); //예외처리
        sc.close();
    }

}

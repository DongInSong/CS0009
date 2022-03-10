package ch3;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        double a, b, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게: ");
        a=sc.nextDouble();
        System.out.print("키: ");
        b=sc.nextDouble();
        result= (b-110)/a;
        System.out.println("결과: "+String.format("%.3f",result));        
        sc.close();

    }
}
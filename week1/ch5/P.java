package ch5;

import java.util.Scanner;

public class P { // factorial 계산
    public static void main(String[] args) {
        int num, facto=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ? ");
        num = sc.nextInt();
        System.out.print(num+"! = ");
        for(int i = num; i>0; i--){
            System.out.print(i);
            if(i>1){
                System.out.print(" * ");
            }
            else System.out.print(" = ");
            facto *=i;
        }
        System.out.println(facto);
        sc.close();
    }
}

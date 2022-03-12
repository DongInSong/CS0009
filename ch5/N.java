package ch5;

import java.util.Scanner;

public class N { // 특정한 숫자 범위에 있는 3의 배수와 5의 배수 출력
    public static void main(String[] args) {
        int num1, num2;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = sc.nextInt();
        if(num1 < num2){
            for(int i = num1; i<=num2;i++){
                if(i%3==0){
                    flag=true;
                }
                else if(i%5==0){
                    flag=true;
                }
                if(flag) System.out.println(i);
                flag=false;
            }
        }
        sc.close();
    }
}

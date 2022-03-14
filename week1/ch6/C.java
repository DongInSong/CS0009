package ch6;

import java.util.Scanner;

public class C { // 나눗셈 연산자 대체 메소드

    public static int div(int a, int b) {
        int cnt = 0;
        if(b==0){ 
            System.out.println("Can't be divided by 0"); 
            return 0;
        }
        while(a >= b){
            a-=b;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수 입력: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("나눗셈 결과 값: " + div(num1, num2)); // 출력 후 줄바꿈
        sc.close();
    }
}
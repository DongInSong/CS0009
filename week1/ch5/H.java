package ch5;

import java.util.Scanner;

public class H { // 2진수의 10진수 변환
    public static void main(String[] args) {
        int num, length = 0, temp = 0, cnt = 1, Decimal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Binary number ? ");
        num = sc.nextInt();
        length = (int) Math.log10(num) + 1;
        for (int i = 0; i < length; i++) {
            temp = num;
            temp %= 10;
            temp *= cnt; // cnt는 제곱, 1, 2, 4, 8.. = 2진수 자리별 값
            Decimal += temp; // 나온 값을 합해줌 = 결과 값
            cnt += cnt;
            num /= 10; // 다음 자릿수로
        }
        System.out.println("Decimal Numer : " + Decimal);
        sc.close();
    }
}

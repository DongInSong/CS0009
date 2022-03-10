package ch6;

import java.util.Scanner;

public class G {

    public static boolean isPrime(int num) {
        var Prime = false;
        if (num < 2) {
            return Prime;
        }
        if (num == 2) {
            Prime = true;
        }
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0)
                return Prime;
        }
        Prime = true;
        return Prime;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("정수 입력: ");
            while (!sc.hasNextInt()) {
                sc.next(); // 줄바꿈 \n
                System.out.println("정수가 아닙니다.");
                System.out.print("정수 입력: ");
            }

            num = sc.nextInt();
            if (num == -1)
                break;
            isPrime(num);
            if (isPrime(num)) {
                System.out.println("소수입니다.");
            } else
                System.out.println("소수가 아닙니다.");
        }
        sc.close();
    }
}
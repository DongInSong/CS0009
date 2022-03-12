package ch5;

import java.util.Scanner;

public class G { // 약수 계산
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number ? ");
        num = sc.nextInt();
        System.out.print("Divisior : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " "); // if (i<num) (" ") 출력 -> 맨 뒤 공간 없애줌
            }
        }
        System.out.println();
        sc.close();
    }
}

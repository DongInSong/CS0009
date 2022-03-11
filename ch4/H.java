package ch4;

import java.util.Scanner;

public class H { // 메뉴 기반 도형 크기 계산기
    public static void main(String[] args) {
        double width, height, result = 0;
        String rtc;
        StringBuffer buffer = new StringBuffer(); // 소수점 출력 버퍼
        Scanner sc = new Scanner(System.in);
        System.out.print("도형 선택(R: 사각형, T: 삼각형, C: 원)? ");
        rtc = sc.next();
        switch (rtc) {
            case "R":
                System.out.println("너비 및 높이 입력? ");
                width = sc.nextInt();
                height = sc.nextInt();
                result = width * height;
                System.out.println("사각형 크기 = " + result);
                break;
            case "T":
                System.out.println("너비 및 높이 입력? ");
                width = sc.nextInt();
                height = sc.nextInt();
                result = (width * height) / 2;
                System.out.println("삼각형 크기 = " + result);
                break;
            case "C":
                System.out.println("반지름 입력? ");
                width = sc.nextInt();
                result = 3.14 * width * width;
                buffer.append(String.format("%.1f", result));
                System.out.println("원 크기 = " + result);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
}

package ch6;

import java.util.Scanner;

public class E {

    public static int randGame() {
        Scanner sc = new Scanner(System.in);
        int guess;
        int answer = (int) (Math.random() * (100));
        System.out.println("내가 선택한 숫자를 맞추어 보세요.");
        while (true) {
            System.out.print("숫자 입력: ");
            guess = sc.nextInt();
            if (guess == answer) {
                System.out.println("내가 선택한 숫자를 정확히 맞췄습니다!");
                sc.close();
                return 0;
            } else {
                if (answer < guess) {
                    System.out.println("내가 선택한 숫자보다 높습니다.");
                } else if (answer > guess) {
                    System.out.println("내가 선택한 숫자보다 낮습니다.");
                } else {
                    System.out.println("Exeption");
                    sc.close();
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        randGame();
    }
}

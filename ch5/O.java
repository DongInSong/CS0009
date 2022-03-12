package ch5;

public class O { // 구구단 출력
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " * "+ i+" = ");
                System.out.format("%2d ", i * j);
            }
            System.out.println();
        }
    }
}

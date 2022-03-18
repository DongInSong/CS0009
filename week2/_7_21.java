import java.util.Scanner;

public class _7_21 { // 바코드를 생성하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 5 digits number > ");
        String num = sc.nextLine();
        barcodeGen(num);
        sc.close();
    }

    private static void barcodeGen(String num) {
        int isLong = 0;
        int lastNum = 0;
        int[][] array = { { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 1, 0, 1 },
                { 0, 0, 1, 1, 0, }, { 0, 1, 0, 0, 1 }, { 0, 1, 0, 1, 0 },
                { 0, 1, 1, 0, 0 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 1, 0 },
                { 1, 0, 1, 0, 0 } };

        int[] position = new int[num.length() + 1]; // 6번째 자리까지 길이 선언
        for (int i = 0; i < num.length(); i++) {
            position[i] = (num.charAt(i) - '0');
            lastNum += position[i];
        }

        lastNum %= 10;
        position[num.length()] = lastNum; // 6번째 바코드, 마지막 인덱스에 추가

        /*
        바코드 위 두 줄, 0이면 공백, 1이면 | 출력
        */
        for (int l = 0; l < 2; l++) {
            for (int k = 0; k < position.length; k++) {
                for (int j = 0; j < array[0].length; j++) {
                    isLong = array[position[k]][j];
                    if (isLong == 0) {
                        System.out.print(" ");
                    } else
                        System.out.print("|");
                }
            }
            System.out.println();
        }

        /*
        바코드 아래 두 줄, 무조건 | 출력
        */
        for (int l = 0; l < 2; l++) {
            for (int k = 0; k < position.length; k++) {
                for (int j = 0; j < array[0].length; j++) {
                    isLong = array[position[k]][j];
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class _7_04 { // 배열의 원소 입력 후 역순 출력
    public static void main(String[] args) {
        int cnt, i;
        int num[] = new int[100];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many integer elements(max 100)? ");
            cnt = sc.nextInt();

            for (i = 0; i < cnt; i++) {
                System.out.print("Enter Array Element" + (i + 1) + ": ");
                num[i] = sc.nextInt();
            }
            num = reverse(num, cnt);

            System.out.print("Reversed array: ");
            for (i = 0; i < cnt; i++) {
                System.out.print(num[i] + " ");
            }
            sc.close();
        }
    }

    private static int[] reverse(int[] num, int cnt) {
        // int[] reversed = new int[100];
        // int count = 0;
        // for (int i = cnt - 1; i >= 0; i--) {
        //      reversed[count] = num[i];
        //      count++;
        // }
        // for (int j = 0; j < cnt; j++) {
        //      num[j] = reversed[j];
        // }
        // return num;

        int j = cnt - 1;
        int i = 0;
        int temp;

        while (i < j) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        return num;
    }
}

import java.util.Scanner;

public class _7_04 { // 배열의 원소 입력 후 역순 출력
    public static void main(String[] args) {
        int cnt, i;
        int num[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("How many integer elements(max 100)?");
        cnt = sc.nextInt();
        sc.close();

        for (i = 0; i < cnt; i++) {
            System.out.println("Enter Array Element" + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        num = reverse(num, cnt);

        System.out.print("Reversed array: ");
        for (i = 0; i < cnt; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static int[] reverse(int[] num, int cnt) {
        int[] reversed = new int[100];
        int count = 0;
        for (int i = cnt - 1; i >= 0; i--) {
            reversed[count] = num[i];
            count++;
        }
        for (int j = 0; j < cnt; j++) {
            num[j] = reversed[j];
        }
        return num;
    }
}

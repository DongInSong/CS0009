import java.util.Scanner;

public class _7_23 { // selection sort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Numbers > ");
        String num = sc.nextLine();

        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = (num.charAt(i) - '0');
        }

        selectionSort(array);
        sc.close();
    }

    private static void selectionSort(int[] array) {
        int tmp = 0;

        /*
         * for (int i = array.length - 1; i >= 0; i--) {
         * if (array[i] < min) {
         * min = array[i];
         * }
         * }
         */

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array[i] == array[array.length - 1]) {
                System.out.println();
            } else
                System.out.print(" ");
        }
    }
}
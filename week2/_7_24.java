import java.util.Scanner;

public class _7_24 { // insertion sort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Numbers > ");
        String num = sc.nextLine();

        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = (num.charAt(i) - '0');
        }

        insertionSort(array);
        sc.close();
    }

    private static void insertionSort(int[] array) {
        int target;
        for (int i = 1; i < array.length; i++) {
            target = array[i];
            int j = i - 1;

            while (j >= 0 && target < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = target;
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

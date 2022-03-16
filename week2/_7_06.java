import java.util.Arrays;

public class _7_06 {
    public static void main(String[] args) { // 배열의 원소 추가 
        int[] my_array = { 11, 22, 33, 44, 55 };
        int index_position = 2;
        int newValue = 99;
        System.out.println("Original Array: " + Arrays.toString(my_array));

        insertArray(my_array, index_position);
        my_array[index_position] = newValue;
        System.out.println("    New Array: " + Arrays.toString(my_array));

    }

    private static void insertArray(int[] my_array, int index_position) {
        for (int i = my_array.length - 1; i > index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
    }
}

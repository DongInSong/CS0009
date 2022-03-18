import java.util.Scanner;

public class _7_22 { // 이진 탐색 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Numbers > ");
        String num = sc.nextLine();
        System.out.print("Input Key value > ");
        int key = sc.nextInt();

        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = (num.charAt(i) - '0');
        }

        binarySearch(array, key);
        sc.close();

    }

    private static int binarySearch(int[] array, int key) {
        /*
        이진 탐색
         1. 중간 값(인덱스 밸류)을 찾는다
         2. 찾은 중간 값과 키 값을 비교한다
         3. 같으면 발견, 다르면 배열을 좁힌다
            1) 중간 값이 더 크면, 중간 값 기준 왼쪽 구간을 탐색
            2) 키 값이 더 크면, 중간 값 기준 오른쪽 구간을 탐색

            (값의 기준으로 구간을 좁히며 탐색하므로 기본적으로 배열 정렬이 필요하다.)
        */
        int mid;
        int left = 0;
        int right = array.length - 1;

        /*
        배열 정렬 검사
        */
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Array is not in order");
                return -1;
            }
        }

        while (left <= right) {
            mid = (left + right) / 2;

            if (array[mid] == key) {
                System.out.println(key + " is in the array, index value " + mid);
                break;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else if (array[mid] > key) {

                right = mid - 1;
            }
        }
        return -1;
    }
}

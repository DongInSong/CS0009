public class _7_02 { // 배열의 원소를 모두 더하여 출력
    public static void main(String[] args) {
        int my_array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0, sum2 = 0;
        for (int i = 0; i<my_array.length; i++){
            sum += my_array[i];
        }
        for(int i : my_array) {
            sum2 += i;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The sum is "+sum2);
    }
}
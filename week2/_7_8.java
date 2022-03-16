public class _7_8 {
    public static void main(String[] args) { // 배열 내의 원소가 지정된 순서대로
        int[] a1 = { 1, 1, 2, 3, 1 };
        int[] a2 = { 1, 1, 2, 4, 1 };
        int[] a3 = { 1, 1, 2, 1, 2, 3 };
        System.out.println(array123(a1));
        System.out.println(array123(a2));
        System.out.println(array123(a3));

    }

    private static boolean array123(int[] a) {
        boolean test = false;
        for(int i = 0; i<a.length-1; i++){
            if(a[i]<a[i+1]){
                test = true;
            }
            else test = false;
        }
        return test;
    }
}

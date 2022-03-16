public class _7_10 {
    public static void main(String[] args) { // 정수형 배열에서 같은 원소가 연속 3번 존재
        int[] a1 = { 1, 1, 2, 2, 1 };
        int[] a2 = { 1, 1, 2, 2, 2, 1 };
        int[] a3 = { 1, 1, 1, 2, 2, 2, 1 };
        System.out.println(noTriples(a1));
        System.out.println(noTriples(a2));
        System.out.println(noTriples(a3));

    }

    private static boolean noTriples(int[] a) {
        for (int i = 0; i < (a.length - 2); i++) {
            if (a[i] == a[i + 1]) {
                if (a[i + 1] == a[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class _7_12 {
    public static void main(String[] args) { // 주어진 스트링 반복 출력
        System.out.println(sTimes("Hi", 3));
        System.out.println(sTimes("Hello", 2));
        System.out.println(sTimes("My Java", 2));

    }

    private static String sTimes(String string, int num) {
        String plus;
        plus = string;
        for (int i = 1; i < num; i++) {
            string += plus;
        }
        return string;
    }
}

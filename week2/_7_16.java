public class _7_16 {
    public static void main(String[] args) { // 주어진 스트링에서 단어별 글자 수 
        String str = "Hello this is Java World";
        System.out.println("String s: " + str);
        count(str);
    }

    private static void count(String str) {
        String[] array = str.split(" ");
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                cnt++;
            }
            System.out.println((i + 1) + " : " + array[i] + " : " + cnt);
            cnt = 0;
        }

    }
}

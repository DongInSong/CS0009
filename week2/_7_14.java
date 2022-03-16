import java.util.Scanner;

public class _7_14 {
    public static void main(String[] args) { // 입력된 스트링과 패스워드 규칙
        Scanner sc = new Scanner(System.in);
        System.out.print("1. 8글자 이상입니다.\n"
                + "2. 영문자와 숫자만 사용 가능합니다.\n"
                + "3. 숫자는 2개 이상이어야 합니다.\n"
                + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
        String s = sc.nextLine();
        sc.close();

        if (is_Valid_Password(s)) {
            System.out.println("적절한 패스워드입니다: " + s);
        } else {
            System.out.println("패스워드 규칙에 어긋납니다: " + s);
        }
    }

    private static boolean is_Valid_Password(String s) {
        int numCnt = 0;
        int EngCnt = 0;

        if (s.length() < 8)
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numCnt++;
            } else if (ch >= 'a' && ch <= 'z') {
                EngCnt++;
            } else
                return false;
        }
        return (numCnt > 1 && EngCnt > 0); // 숫자 2개 이상, 영문자 1개 이상
    }
}

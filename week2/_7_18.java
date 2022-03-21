public class _7_18 {
    public static void main(String[] args) { // 주어진 스트링에서 앞쪽 0 글자 제거
        String str = "000000100234000";
        System.out.println("String    = " + str);
        str = removeFrontZ(str);
        System.out.println("Converted = " + str);
    }

    private static String removeFrontZ(String str) {

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch != '0')
        //         return str;
        //     if (ch == '0') {
        //         str = str.substring(1);
        //         i--; //문자 검색 인덱스 0으로 초기화
        //     }
        // }

        int i = 0;
        StringBuffer sb = new StringBuffer(str);

        while(str.charAt(i)=='0'){
            i++;
        }
        sb.replace(0, i, "");
        return sb.toString();
    }
}

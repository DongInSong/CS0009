import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _3 { // 파일 입력, 표준 출력
    public static void main(String[] args) throws IOException {
        String name;
        int age, ageSum = 0, count = 0;
        float height, heightSum = 0.0F;
        boolean b = false; // 실습 4와 데이터 공유를 위한 임시 처리 변수

        Scanner s = new Scanner(new File("week3/p3.in"));

        while (s.hasNext()) {
            b = s.nextBoolean();
            name = s.next();
            age = s.nextInt();
            height = s.nextFloat();
            ageSum += age;
            heightSum += height;
            count++;
            System.out.printf("%5s%5d%10.1f\n", name, age, height);
        }

        System.out.println();
        System.out.println("total number: " + count);
        System.out.println("average age: " + ageSum / count);
        System.out.printf("average height: %.3f", heightSum / count);
    }
}

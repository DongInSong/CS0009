import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) throws IOException {
        String name;
        int age, ageSum = 0, count = 0;
        float height, heightSum = 0.0F;

        Scanner s = new Scanner(new File("week3/p3.in"));

        while (s.hasNext()) {
            if (!s.nextBoolean()) {
                s.nextLine();
                continue;
            }
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
        System.out.printf("average height: %10.3f", heightSum / count);
    }
}

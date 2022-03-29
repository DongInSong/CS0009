import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class _2 { // 파일로부터 double만 읽기
    public static void main(String[] args) throws FileNotFoundException {
        double sum = 0;
        Scanner s = new Scanner(new BufferedReader(new FileReader("week3/a.dat")));

        while (s.hasNext()) {
            if (s.hasNextDouble())
                sum += s.nextDouble();
            else
                s.next();
        }

        System.out.println(sum);
    }
}

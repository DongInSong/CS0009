
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1_02 {
    static File filePath = new File("week3/_1.txt");
    public static void main(String[] args) { // file input
        try {
            Scanner sc = new Scanner(filePath);
            String name = sc.next();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            boolean tf = sc.nextBoolean();

            System.out.println("My name is " + name + "(" + gender + ")" + ", age is " + age + ".\n" +
                    "This statement is " + tf);
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

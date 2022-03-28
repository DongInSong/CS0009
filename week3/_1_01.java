import java.util.Scanner;

public class _1_01 {
    public static void main(String[] args) { // println printf
        /*
         * 입력: 이름, 나이, 성별, 진위 여부(true or false)
         * 
         * 출력:
         * My name is 홍길동(M), age is 25.
         * This statement is false.
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        boolean tf = sc.nextBoolean();

        System.out.println("My name is " + name + "(" + gender + ")" + ", age is " + age + ".\n" +
                "This statement is " + tf + ".");

        System.out.printf("My name is %s(%c), age is %d.\n", name, gender, age);
        System.out.printf("This statement is %b.", tf);
        sc.close();

    }

}

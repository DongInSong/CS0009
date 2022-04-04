import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class asgmt_4_3 {
    public static void main(String[] args) throws IOException {
        File target;
        String option = "";
        if (args.length > 1) {
            option = args[0];
            target = new File(args[1]);
        } else
            target = new File(args[0]);
        BufferedReader rd;

        if (target.exists()) {
            if (option.equals("-h")) {
                //System.out.println("option h");
                rd = new BufferedReader(new FileReader(target));
                for (int i = 0; i < 5; i++) {
                    System.out.println("Line" + (i + 1) + ": " + rd.readLine());
                }
                rd.close();
            }

            else if (option.equals("-t")) {
                //System.out.println("option t");
                int cnt = 0;
                rd = new BufferedReader(new FileReader(target));
                while (rd.readLine() != null) {
                    cnt++;
                }
                rd.close();
                rd = new BufferedReader(new FileReader(target));
                for (int i = 0; i < cnt - 5; i++) {
                    rd.readLine();
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println("Line" + (i + 1) + ": " + rd.readLine());
                }
                rd.close();

            } else {
                //System.out.println("no option");
                rd = new BufferedReader(new FileReader(target));
                String str;
                while ((str = rd.readLine()) != null) {
                    System.out.println(str);
                }
                rd.close();
            }

        } else {
            System.out.println("File not found");
            System.out.println("Content [-h|-t|-c] file");
        }
    }
}

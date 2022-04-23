package bankPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class saveAccount {
    public saveAccount() {}
    
    public void save(int accId, int balance) {
        String path = "week5/bankPackage/bankDB.txt";
        File file = new File(path);
        String tempFile = "week5/bankPackage/Temp.txt";
        File oldFile = new File(path);
        File newFile = new File(tempFile);
        String a = Integer.toString(accId);
        String b = Integer.toString(balance);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String record = sc.nextLine();
                String[] fields = record.split(" ");
                if (record.split(":") != null) {
                    fields[fields.length - 1] = fields[fields.length - 1].substring(0,fields[fields.length - 1].length() - 1); // : 지우기
                    if (fields[0].equals(a)) {
                        pw.println(a + " " + b + ":");
                    } 
                    else
                        pw.println(fields[0] + " " + fields[1] + ":");
                }
            }
            sc.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);
        }

        catch (Exception e) {
            System.out.println("error");
        }
    }
}

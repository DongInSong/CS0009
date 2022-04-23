package bankPackage;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class makeAccount {
    public makeAccount(){}
    
    public void make(account account, List<account> accList) {
        try {
            File file = new File("week5/bankPackage/bankDB.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                String[] fields = record.split(" ");
                if (record.split(":") != null) {
                    fields[fields.length - 1] = fields[fields.length - 1].substring(0, fields[fields.length - 1].length() - 1); // : 지우기
                    int accId = Integer.parseInt(fields[0]);
                    int balance = Integer.parseInt(fields[1]);
                    account = new account(accId, balance);
                    accList.add(account);
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("no file");
        }
    }
}
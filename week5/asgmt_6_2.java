import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankPackage.account;
import bankPackage.makeAccount;
import bankPackage.saveAccount;

public class asgmt_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        account account;
        List<account> accList = null;
        makeAccount make = null;
        

        Path path = Paths.get("week5/bankPackage/account");
        if (Files.exists(path)) {
            System.out.println("Already Serialized");
        } else {
            account = new account();
            System.out.println("Serializing...");
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(new File("week5/bankPackage/account"))))) {
                out.writeObject(account);
                System.out.println("Serialized");

            } catch (Exception e) {
                System.out.println("Serialize Error");
            }
        }

        System.out.println("Deserializing...");
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(new File("week5/bankPackage/account"))))) {
            account = (account) in.readObject();
            System.out.println("Deserialized");
            accList = new ArrayList<account>();
            make = new makeAccount();

        } catch (Exception e) {
            account = null;
            System.out.println("Deserialize Error");
        }

        make.make(account, accList);
        saveAccount saveAccount = new saveAccount();

        int user_id = -1;
        int money;
        boolean isExist = false;

        while (true) {
            System.out.print("Enter Account Id: ");
            int id = scanner.nextInt();
            for (int i = 0; i < accList.size(); i++) {
                if (id == accList.get(i).getAccId()) {
                    isExist = true;
                    user_id = i;
                }
            }
            if (isExist) {
                System.out.println("???????????????.");
                while (true) {
                    System.out.println("?????? ????????? " + accList.get(user_id).getBalance() + "??? ?????????.");
                    System.out.println("1. ?????? | 2. ?????? | 3. ?????? | 4. ??????");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("?????? ??????: ");
                            money = scanner.nextInt();
                            accList.get(user_id).deposit(money);
                            saveAccount.save(user_id + 1, accList.get(user_id).getBalance());
                            break;
                        case 2:
                            System.out.print("?????? ??????: ");
                            money = scanner.nextInt();
                            accList.get(user_id).withdraw(money);
                            saveAccount.save(user_id + 1, accList.get(user_id).getBalance());
                            break;
                        case 3:
                            /*
                             * user_id = ??????????????? ????????? ?????? (???????????? +1)
                             * transfer_id = ?????????????????? (????????? -1)
                             * ?????? ????????? ??????
                             */
                            int transfer_id;
                            System.out.print("?????? ????????????: ");
                            transfer_id = scanner.nextInt();
                            System.out.print("?????? ??????: ");
                            money = scanner.nextInt();
                            for (int i = 0; i < accList.size(); i++) {
                                if (transfer_id == accList.get(i).getAccId()) {
                                    accList.get(user_id).withdraw(money);
                                    accList.get(transfer_id - 1).deposit(money);
                                    saveAccount.save(user_id + 1, accList.get(user_id).getBalance());
                                    saveAccount.save(transfer_id, accList.get(transfer_id - 1).getBalance());
                                }
                            }
                            break;
                        case 4:
                            scanner.close();
                            saveAccount.save(user_id + 1, accList.get(user_id).getBalance());
                            System.exit(0);
                        default:
                            break;
                    }
                }
            } else if (!isExist) {
                System.out.println("Error");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankPackage.account;
import bankPackage.makeAccount;
import bankPackage.saveAccount;

public class asgmt_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        account account = new account();
        List<account> accList = new ArrayList<account>();
        makeAccount make = new makeAccount();
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
                System.out.println("환영합니다.");
                while (true) {
                    System.out.println("현재 잔고는 " + accList.get(user_id).getBalance() + "원 입니다.");
                    System.out.println("1. 입금 | 2. 출금 | 3. 이체 | 4. 종료");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("입금 금액: ");
                            money = scanner.nextInt();
                            accList.get(user_id).deposit(money);
                            saveAccount.save(user_id+1, accList.get(user_id).getBalance());
                            break;
                        case 2:
                            System.out.print("출금 금액: ");
                            money = scanner.nextInt();
                            accList.get(user_id).withdraw(money);
                            saveAccount.save(user_id+1, accList.get(user_id).getBalance());
                            break;
                        case 3:
                            int transfer_id;
                            System.out.print("이체 계좌번호: ");
                            transfer_id = scanner.nextInt();
                            System.out.print("이체 금액: ");
                            money = scanner.nextInt();
                            for (int i = 0; i < accList.size(); i++) {
                                if (transfer_id == accList.get(i).getAccId()) {
                                    accList.get(user_id).withdraw(money);
                                    accList.get(transfer_id-1).deposit(money);
                                    saveAccount.save(user_id+1, accList.get(user_id).getBalance());
                                    saveAccount.save(transfer_id, accList.get(transfer_id-1).getBalance());
                                }
                            }
                            break;
                        case 4:
                            scanner.close();
                            saveAccount.save(user_id+1, accList.get(user_id).getBalance());
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

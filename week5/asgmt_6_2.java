import java.util.ArrayList;
import java.util.List;
import bankPackage.account;
import bankPackage.makeAccount;

public class asgmt_6_2 {
    public static void main(String[] args) {
        account account = new account();
        List<account> accList = new ArrayList<account>();
        makeAccount make = new makeAccount(account, accList);


        for (int i = 0; i < accList.size(); i++)
        System.out.println(accList.get(i).getAccId() + " " + accList.get(i).getBalance());
    }
}

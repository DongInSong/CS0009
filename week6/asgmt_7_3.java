import java.util.Date;
import java.time.LocalDate;
import java.util.TreeSet;

public class asgmt_7_3 {
    public int accoutNum;
    public int balance;
    public int amount;
    public String name;

    logAccount logAccount = new logAccount();
    Customer customer;

    public asgmt_7_3(int amount){
        balance = amount;
    }

    // 고객 생성
    public void newCustomer(String name){
        customer = new Customer(name);
    }

    // 입금
    public void deposit(int amount){
        balance += amount;
        logAccount.logDeposit(amount);
    }

    // 출금
    public void Withdraw(int amount){
        balance -= amount;
        logAccount.logWithdraw(amount);
    }

}

class logAccount{

    private String[][] log = new String[10][3];
    private TreeSet<Record> transactions = new TreeSet<>(new RecordComparator());
    private static int index = 0;

    private static int nextIndex() {
        return ++index;
    }

    public logAccount() {
    }

    public void logDeposit(int amount) {

        // RECORD
        transactions.add(new Record("입금", new Date(), amount));

        // ARRAY
        log[index][0] = "입금";
        log[index][1] = LocalDate.now().toString();
        log[index][2] = String.valueOf(amount);
        resetLog();
        nextIndex();

    }

    public void logWithdraw(int amount) {

        // RECORD
        transactions.add(new Record("출금", new Date(), amount));

        // ARRAY
        log[index][0] = "출금";
        log[index][1] = LocalDate.now().toString();
        log[index][2] = String.valueOf(amount);
        resetLog();
        nextIndex();
    }

    public void resetLog() {
        if (log.length > 10) {
            for (int i = 0; i < log.length; i++) {
                for (int j = 0; j < 3; j++) {
                    log[i][j] = null;
                }
            }
        }
    }

}


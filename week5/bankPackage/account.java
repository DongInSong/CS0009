package bankPackage;

public class account implements accInterface, java.io.Serializable {

    private int accountId;
    private int balance;

    public account() {
    }

    public account(int id, int bal) {
        this.accountId = id;
        this.balance = bal;
    }

    @Override
    public int getAccId() {
        return accountId;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int transfer(int target, int val) {
        return val;

    }

    @Override
    public boolean deposit(int val) {
        if (val < 0) {
            System.out.println("Error");
            return false;
        } else {
            balance += val;
            return true;
        }
    }

    @Override
    public boolean withdraw(int val) {
        if (val < 0 || balance < val) {
            System.out.println("Error");
            return false;
        } else {
            balance -= val;
            return true;
        }
    }
}

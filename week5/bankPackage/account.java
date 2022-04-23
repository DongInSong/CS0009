package bankPackage;

public class account implements accInterface {

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
    public void transfer(int val) {
    }

    @Override
    public void deposit(int val) {
        // TODO Auto-generated method stub
        this.balance += val;
    }

    @Override
    public void withdraw(int val) {
        // TODO Auto-generated method stub
        this.balance -= val;
    }

}

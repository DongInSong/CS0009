public class asgmt_7_account {
    public int accoutNum, balance;
    private String owner;
    
    public asgmt_7_account(int amount){
        balance = amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void Withdraw(int amount){
        balance -= amount;
    }

    public int getAccNum() {
        return accoutNum;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public asgmt_7_account(String owner) {
        accoutNum = nextNumber();
    }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }
}

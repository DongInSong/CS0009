import asgmt_7.LogGenerator;

public class asgmt_7_3 {
    public int accoutNum;
    public int balance;
    public int amount;
    public String name;

    LogGenerator logAccount = new LogGenerator();
    Customer customer;

    public asgmt_7_3(String name) {
        accoutNum = nextNumber();
        this.name = name;
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
    
    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }
}


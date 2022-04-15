package asgmt_5_1;

public class Customer {
    private int custNum;
    private String custName;
    private Account account;

    public int getCustNum() {
        return custNum;
    }

    public String getCustName() {
        return custName;
    }

    public void deposit(int amount) {
        account.balance += amount;
    }

    public void withdraw(int amount) {
        account.balance -= amount;
    }

    public Customer(String custName) {
        account = new Account(custName + "'s Account");
        custNum = nextNumber();
        this.custName = custName;
    }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }

    public void show() {
        System.out.println("***************************");
        System.out.println("계좌번호: " + account.getAccNum() +
                "\n고객번호: " + custNum +
                "\n계좌이름: " + account.getOwner() +
                "\n고객이름: " + custName +
                "\n계좌잔액: " + account.getBalance());
        System.out.println("***************************");
    }
}

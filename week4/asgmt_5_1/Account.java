package asgmt_5_1;

public class Account {
    public int accNum;
    public int balance;
    private String owner;

    public int getAccNum() {
        return accNum;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public Account(String owner) {
        accNum = nextNumber();
        this.owner = owner;
    }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }
}
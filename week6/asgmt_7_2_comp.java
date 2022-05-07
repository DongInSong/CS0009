public class asgmt_7_2_comp {

    public int balance;
    public int amount;

    LogGenerator logGenerator = new LogGenerator();

    public asgmt_7_2_comp(int amount){
        balance = amount;
    }

    // 입금
    public void deposit(int amount){
        balance += amount;
        logGenerator.logDeposit(amount);
    }

    // 출금
    public void Withdraw(int amount){
        balance -= amount;
        logGenerator.logWithdraw(amount);
    }

}
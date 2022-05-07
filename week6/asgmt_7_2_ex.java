public class asgmt_7_2_ex extends LogGenerator {

    public int balance;
    public int amount;

    public asgmt_7_2_ex(int amount){
        balance = amount;
    }

    // 입금
    public void deposit(int amount){
        balance += amount;
        logDeposit(amount);
    }

    // 출금
    public void Withdraw(int amount){
        balance -= amount;
        logWithdraw(amount);
    }

}
package bankPackage;

public interface accInterface{
    int getAccId();
    int getBalance();
    void transfer(int val);
    void deposit(int val);
    void withdraw(int val);
}

package bankPackage;

public interface accInterface{
    int getAccId();
    int getBalance();
    int transfer(int target, int val);
    boolean deposit(int val);
    boolean withdraw(int val);
}

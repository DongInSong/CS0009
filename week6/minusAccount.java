public class minusAccount extends asgmt_7_account {
    private int limit;
    
    public minusAccount(int amount, int limit) { 
		super(amount); 				
	}

    @Override
    public void deposit(int amount) {
        // TODO Auto-generated method stub
        super.deposit(amount);
    }

    @Override
    public void Withdraw(int amount) {
        // TODO Auto-generated method stub
        if(getBalance() + limit >= amount) super.Withdraw(amount);
    }
}
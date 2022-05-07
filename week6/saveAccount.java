import java.time.LocalDate;

public class saveAccount extends asgmt_7_account{
    public int monthlyPay, rate;
    

    LocalDate today = LocalDate.of(2022, 5, 1);
    LocalDate contratDate =LocalDate.of(2022, 1, 1);
    LocalDate expirationDate = LocalDate.of(2023, 8, 22);

    int todayDay = today.getDayOfMonth();
    int depositDay = contratDate.getDayOfMonth();

    public saveAccount(int amount) {
        super(amount);
    }

    @Override
    public void deposit(int monthlyPay) {
        // TODO Auto-generated method stub
        if(todayDay == depositDay) {
            super.deposit(monthlyPay);
            System.out.println("today day: "+ todayDay+ " depositDay: "+depositDay);
        }
        else System.out.println("Not deposit Day");
    }

    @Override
    public void Withdraw(int amount) {
        // TODO Auto-generated method stub
        if(today.equals(expirationDate)) 
        super.Withdraw(amount * rate);
    }    

}

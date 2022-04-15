import asgmt_5_1.Customer;

public class asgmt_5_1 {
    public static void main(String[] args){
        Customer customer1 = new Customer("Donnie");
        Customer customer2 = new Customer("Moo");
        customer1.deposit(100000);
        customer1.show();
        customer2.deposit(200);
        customer2.show();
    }
}

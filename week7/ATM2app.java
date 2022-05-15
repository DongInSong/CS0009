import java.util.Scanner;

/* Boundary classes:
	- Keypad represents the keypad of the ATM.
	- Screen represents the screen of the ATM.
	- Menu represents the main menu of the ATM
*/

class Keypad {
    private Scanner input;

    public Keypad() {
        input = new Scanner(System.in);
    }

    public int getInput() {
        return input.nextInt();
    }
}

class Screen {
    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayMessageLine(String message) {
        System.out.println(message);
    }

    public void displayAmount(int amount) {
        System.out.printf("%d", amount);
    }
}

class Menu {
    // menu option constants
    public static final int BALANCE_INQUIRY = 1;
    public static final int WITHDRAWAL = 2;
    public static final int DEPOSIT = 3;
    public static final int EXIT = 4;
    public static final int PROGRAM_TERMINATE = 5;

    // display main menu and get user command
    public int displayMainMenu(Screen screen, Keypad keypad) {
        screen.displayMessageLine("\n\t\t     MENU:\n");
        screen.displayMessageLine("\t\t1 - Inquiry balance");
        screen.displayMessageLine("\t\t2 - Withdraw");
        screen.displayMessageLine("\t\t3 - Deposit");
        screen.displayMessageLine("\t\t4 - Exit");
        screen.displayMessageLine("\t\t5 - Bye\n");
        screen.displayMessage("\tChoice: ");
        return keypad.getInput();
    }
}
/*
 * message management class
 */

class Message {
    // constants corresponding to messages
    public static final String WELCOME = "\nWelcome!\n";
    public static final String GOODBYE = "\tBye...";
    public static final String BALANCE = "\tBalance: ";
    public static final String LIMIT = "\tLimit: ";

    public static final String ERR_AUTH = "\n\tError: wrong account number or PIN number.";
    public static final String ERR_CHOICE = "\tWrong choice. Enter number between 1 and 5";
    public static final String ERR_DEBIT = "\tInsufficient balance";

    public static final String INPUT_NUMBER = "\tEnter your account number: ";
    public static final String INPUT_PIN = "\tEnter your PIN number: ";
    public static final String INPUT_AMOUNT = "\tEnter amount (0 to cancel): ";

    public static final String CANCEL_CREDIT = "\tCancel the deposit";
    public static final String CANCEL_DEBIT = "\tCancel the withdraw";

    public static final String FINISH_CREDIT = "\tComplete the deposit";
    public static final String FINISH_DEBIT = "\tComplete the withdraw";
}
/*
 * Entity classes:
 * - Account represents a bank account.
 * - BankDatabase represents the bank account information database.
 */

class Account {
    private int accountNumber;
    private int pin;
    private int balance;
    int limit = 0;
    boolean isMinusAccount = false;

    public Account(int number, int pin, int amount) {
        accountNumber = number;
        this.pin = pin;
        balance = amount;
    }

    // Minus Account
    public Account(int number, int pin, int amount, boolean isMinusAccount, int limit) {
        accountNumber = number;
        this.pin = pin;
        balance = amount;
        this.limit = limit;
        this.isMinusAccount = isMinusAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public boolean validatePIN(int pin) {
        return (pin == this.pin) ? true : false;
    }
} // end class Account

class BankDatabase { // class BankDatabase<Integer, Account> extends TreeMap<Integer, Account>
    private Account accounts[]; // array of Accounts

    public BankDatabase() {
        accounts = new Account[6];
        accounts[0] = new Account(1, 11, 1000);
        accounts[1] = new Account(2, 22, 2000);
        accounts[2] = new Account(3, 33, 3000);
        accounts[3] = new Account(4, 44, 3000, true, 10000);
        accounts[4] = new Account(5, 55, 3000, true, 3000);
        accounts[5] = new Account(6, 66, 3000, true, 5000);

    }

    public int getBalance(int number) {
        return getAccount(number).getBalance();
    }

    public int getLimit(int number) {
        return getAccount(number).getLimit();
    }

    public void deposit(int number, int amount) {
        getAccount(number).deposit(amount);
    }

    public void withdraw(int number, int amount) {
        getAccount(number).withdraw(amount);
    }

    public boolean authenticateUser(int number, int pin) {
        Account account = getAccount(number);
        return (account != null) ? account.validatePIN(pin) : false;
    }

    // helper method
    private Account getAccount(int number) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == number)
                return account;
        }
        return null;
    }

    public boolean isMinusAccount(int number) {
        if (getAccount(number).isMinusAccount) {
            return true;
        } else
            return false;
    }
} // end class BankDatabase
/*
 * Control classes:
 * - ATM represents an automated teller machine (MAIN CONTROL)
 * (1) accepts user command
 * (2) performs the command using DELEGATION to Transaction
 * - ITransaction is an interface representing an ATM transaction per use case.
 * - Transcation is an adapter class that implements Transaction. (for code
 * reuse)
 * - BalanceInquiry represents a balance inquiry ATM transaction.
 * - Deposit represents a deposit ATM transaction.
 * - Withdrawal represents a withdrawal ATM transaction.
 */

interface ITransaction {
    public final static int CANCELED = 0; // cancal a deposit or withdraw transaction

    abstract public int getAccountNumber();

    abstract public BankDatabase getBankDatabase();

    abstract public void execute();

    default public int promptForAmount(Screen screen, Keypad keypad) {
        screen.displayMessage(Message.INPUT_AMOUNT);

        int input = keypad.getInput();
        return (input == CANCELED) ? CANCELED : input;
    }
}

// class CreateAccount implements ITransaction {...}

class Transaction implements ITransaction {
    protected int currentAccountNumber; // current account
    protected Screen screen; // composition of a collaborating class
    protected BankDatabase database; // composition of a collaborating class

    public Transaction(int number, Screen screen, BankDatabase database) {
        currentAccountNumber = number;
        this.screen = screen;
        this.database = database;
    }

    public int getAccountNumber() {
        return currentAccountNumber;
    }

    public BankDatabase getBankDatabase() {
        return database;
    }

    public void execute() {
        // do nothing ( or abstract void execute(); )
    }
} // end class Transaction

class BalanceInquiry extends Transaction {
    public BalanceInquiry(int number, Screen screen, BankDatabase database) {
        super(number, screen, database);
    }

    // performs the task of balance inquiry
    public void execute() {
        boolean isMinusAccount;
        isMinusAccount = database.isMinusAccount(getAccountNumber());
        if (isMinusAccount) {
            screen.displayMessageLine(Message.BALANCE
                    + getBankDatabase().getBalance(getAccountNumber()));
            screen.displayMessageLine(Message.LIMIT + getBankDatabase().getLimit(getAccountNumber()));
        } else {
            screen.displayMessageLine(Message.BALANCE
                    + getBankDatabase().getBalance(getAccountNumber()));
        }
    }
} // end class BalanceInquiry

class Deposit extends Transaction {
    private int amount;
    private Keypad keypad; // composition of additional collaborating class

    public Deposit(int number, Screen screen, BankDatabase database, Keypad keypad) {
        super(number, screen, database);
        this.keypad = keypad;
    }

    /* performs the task of deposit */
    public void execute() {
        amount = promptForAmount(screen, keypad); // get deposit amount from user
        if (amount != CANCELED) {
            database.deposit(getAccountNumber(), amount);
            screen.displayMessageLine(Message.FINISH_CREDIT);
        } else {
            screen.displayMessageLine(Message.CANCEL_CREDIT);
        }
    }
} // end class Deposit

class Withdrawal extends Transaction {
    private int amount;
    private Keypad keypad; // composition of additional collaborating class

    private final static int CANCELED = 0;

    public Withdrawal(int number, Screen screen, BankDatabase database, Keypad keypad) {
        super(number, screen, database);
        this.keypad = keypad;
    }

    // perform transaction
    public void execute() {
        int balance;
        int limit;
        boolean isMinusAccount;

        amount = promptForAmount(screen, keypad);
        if (amount != CANCELED) {
            balance = database.getBalance(getAccountNumber());
            limit = database.getLimit(getAccountNumber());
            isMinusAccount = database.isMinusAccount(getAccountNumber());

            if (isMinusAccount) {
                if ((balance - amount) >= limit * (-1)) {
                    database.withdraw(getAccountNumber(), amount);
                    screen.displayMessageLine(Message.FINISH_DEBIT);
                } else {
                    screen.displayMessageLine(Message.ERR_DEBIT);
                }
            }

            else {
                if (amount <= balance) {
                    database.withdraw(getAccountNumber(), amount);
                    screen.displayMessageLine(Message.FINISH_DEBIT);
                } else {
                    screen.displayMessageLine(Message.ERR_DEBIT);
                }
            }
        } else {
            screen.displayMessageLine(Message.CANCEL_DEBIT);
        }
        return;
    }
} // end class Withdrawal

class ATM {
    private int currentAccountNumber; // current account
    private boolean userAuthenticated;

    /* Collaborating classes */
    private Screen screen;
    private Keypad keypad;
    private Menu mainMenu;
    private BankDatabase database;
    ITransaction currentTransaction = null; // Polymorphic Composition

    public ATM() {
        userAuthenticated = false;
        currentAccountNumber = 0; // no current account number to start
        screen = new Screen();
        keypad = new Keypad();
        mainMenu = new Menu();
        database = new BankDatabase();
    }

    /* start ATM : welcome, authenticate user, perform transactions */
    public void run() {
        while (true) {
            screen.displayMessageLine(Message.WELCOME);
            while (!userAuthenticated) { // loop while not yet authenticated
                authenticateUser();
            }
            performTransactions(); // Do THE REQUIRED TASK

            // initializatin for next ATM session
            userAuthenticated = false;
            currentAccountNumber = 0;
            screen.displayMessageLine(Message.GOODBYE);
        }
    } // run()

    // user authentication
    private boolean authenticateUser() {
        screen.displayMessage(Message.INPUT_NUMBER);
        int number = keypad.getInput();
        screen.displayMessage(Message.INPUT_PIN);
        int pin = keypad.getInput();

        userAuthenticated = database.authenticateUser(number, pin);
        if (userAuthenticated) {
            currentAccountNumber = number;
        } else {
            screen.displayMessageLine(Message.ERR_AUTH);
        }
        return userAuthenticated;
    }

    // display main menu and Execute transactios
    private void performTransactions() {
        boolean userExited = false;
        while (!userExited) {
            // (1) accepts user request (command)
            int command = mainMenu.displayMainMenu(screen, keypad);

            // (2) performs the command using DELEGATION to Transaction
            switch (command) {
                case Menu.BALANCE_INQUIRY:
                case Menu.WITHDRAWAL:
                case Menu.DEPOSIT:
                    currentTransaction = createTransaction(command);
                    currentTransaction.execute();
                    currentTransaction = null;
                    break;
                case Menu.EXIT:
                    userExited = true;
                    break;
                case Menu.PROGRAM_TERMINATE:
                    System.exit(0);
                    break;
                default:
                    screen.displayMessageLine(Message.ERR_CHOICE);
                    break;
            }
        }
    } // performTransactions()

    // Create transaction
    private ITransaction createTransaction(int type) {
        ITransaction temp = null;

        switch (type) {
            case Menu.BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, database);
                break;
            case Menu.WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, database, keypad);
                break;
            case Menu.DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, database, keypad);
                break;
        }
        return temp;
    }
} // end class ATM
/*
 * Driver program and ATM machine
 * - (usually performs system configuration/initialization task)
 * - Create and run an ATM object
 * 
 */

public class ATM2app {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}
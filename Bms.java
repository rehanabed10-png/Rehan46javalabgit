class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String accountType;

    public Account(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited $" + amount + " into Account " + accountNumber);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(" Withdrew $" + amount + " from Account " + accountNumber);
            return true;
        } else {
            System.out.println(" Transaction Failed: Insufficient funds in Account " + accountNumber);
            return false;
        }
    }

    public void transfer(Account targetAccount, double amount) {
        System.out.println("\n Initiating Transfer of $" + amount + " from " + this.accountNumber + " to " + targetAccount.accountNumber + "...");
        if (this.withdraw(amount)) {
            targetAccount.deposit(amount);
            System.out.println(" Transfer successful!");
        } else {
            System.out.println(" Transfer failed.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Type  : " + accountType);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(" Interest of $" + interest + " applied to Account " + accountNumber);
    }
}


class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(" Withdrew $" + amount + " (Using Overdraft) from Account " + accountNumber);
            return true;
        } else {
            System.out.println(" Transaction Failed: Exceeded Overdraft Limit in Account " + accountNumber);
            return false;
        }
    }
}


public class Bms  {
    public static void main(String[] args) {

        SavingsAccount aliceAccount = new SavingsAccount("SAV123", "Alice", 5000.0, 0.04);
        CurrentAccount bobAccount = new CurrentAccount("CUR456", "Bob", 2000.0, 1000.0);


        aliceAccount.displayDetails();
        bobAccount.displayDetails();

        System.out.println("\n--- Executing Transactions ---");


        aliceAccount.deposit(1000.0);


        bobAccount.withdraw(2500.0);


        aliceAccount.calculateInterest();


        aliceAccount.transfer(bobAccount, 500.0);


        aliceAccount.displayDetails();
        bobAccount.displayDetails();
    }
}

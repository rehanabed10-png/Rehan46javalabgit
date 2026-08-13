import java.util.Scanner;

class BankAccount {

    private double balance;


    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public double getBalance() {
        return balance;
    }
}

class Rehan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter initial balance: ");
        double initial = sc.nextDouble();
        BankAccount reh = new BankAccount(initial);
        

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        

        reh.deposit(depositAmount);
        
        System.out.println("Final Balance: " + reh.getBalance());
        
        sc.close(); 
    }
}

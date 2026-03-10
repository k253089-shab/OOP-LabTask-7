class BankAccount{
    String accountNumber;
    String accountHolderName;
    private double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    void calculateInterest(){
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
    }
}

public class Main{
    public static void main(String[] args){
        SavingsAccount acc = new SavingsAccount();

        acc.accountNumber = "12345";
        acc.accountHolderName = "Ali";
        acc.setBalance(1000);

        acc.interestRate = 5;

        acc.deposit(500);
        acc.withdraw(200);
        acc.calculateInterest();

        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Holder: " + acc.accountHolderName);
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Interest Rate: " + acc.interestRate + "%");
    }
}

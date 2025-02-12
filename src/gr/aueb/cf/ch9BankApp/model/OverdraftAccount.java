package gr.aueb.cf.ch9BankApp.model;

public class OverdraftAccount {

    private int accountBalance;
    private int overdraftLimit;

    public OverdraftAccount() {
    }

    public OverdraftAccount(int accountBalance, int overdraftLimit) {
        this.accountBalance = accountBalance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Your current account balance is: " + accountBalance);
        } else {
            System.out.println("Deposit amount must be a positive number.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (accountBalance + overdraftLimit >= amount) {
                accountBalance -= amount;
                System.out.println("Withdrawal successful. Your new balance is: " + accountBalance);
            } else {
                System.out.println("Withdrawal denied: Insufficient funds, exceeding overdraft limit.");
            }
        } else {
            System.out.println("Invalid transaction: Withdrawal amount must be positive.");
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "OverdraftAccount{" +
                "accountBalance=" + accountBalance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}

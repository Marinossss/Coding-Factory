package gr.aueb.cf.ch9BankApp.model;

public class JointAccount {

    private String primaryHolder;
    private String secondaryHolder;
    private double accountBalance;

    public JointAccount() {
    }

    public JointAccount(String primaryHolder, String secondaryHolder, double accountBalance) {
        this.primaryHolder = primaryHolder;
        this.secondaryHolder = secondaryHolder;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Your total account balance is: " + accountBalance);
        } else {
            System.out.println("Deposit amount must be a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount < accountBalance) {
            accountBalance -= amount;
            System.out.println("Your new account balance is: " + accountBalance);
        } else {
            System.out.println("Transaction failed: Insufficient funds.");
        }
    }

    public String getPrimaryHolder() {
        return primaryHolder;
    }

    public void setPrimaryHolder(String primaryHolder) {
        this.primaryHolder = primaryHolder;
    }

    public String getSecondaryHolder() {
        return secondaryHolder;
    }

    public void setSecondaryHolder(String secondaryHolder) {
        this.secondaryHolder = secondaryHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "primaryHolder='" + primaryHolder + '\'' +
                ", secondaryHolder='" + secondaryHolder + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

}

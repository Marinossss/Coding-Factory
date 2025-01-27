package gr.aueb.cf.bankapp.model;

public class OverfraftAccount {

    private int balance;
    private int overdraftLimit;

    public OverfraftAccount() {

    }


    public void deposit(int amount) {

        if (amount > 0) {
                balance += amount;
                System.out.println("Το συνολο του λογαριασμου σας ειναι " + balance);
        } else {
                System.out.println("Η καταθεση πρεπει να ειναι θετικος αριθμος");
        }

    }

    public void withdraw(int amount) {

        if (amount > 0) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
                System.out.println("Το συνολικό ποσό του λογαριασμού σας είναι " + balance);
            } else {
                System.out.println("Δεν μπορείτε να κάνετε ανάληψη. Το υπόλοιπο είναι μικρότερο από το όριο υπερανάληψης.");
            }
        } else {
            System.out.println("Δεν μπορεί να πραγματοποιηθεί αυτη η συναλλαγή");
        }

    }

    public OverfraftAccount(int balance, int overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String toString() {
        return "OverdraftAccount{" +
                "balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}

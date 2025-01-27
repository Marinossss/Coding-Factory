package gr.aueb.cf.bankapp.model;

public class JointAccount {


    private String holder1;
    private String holder2;
    private double balance;

     public JointAccount() {

    }

    public JointAccount(String holder1, String holder2, double balance) {
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.balance = balance;
    }

    public void deposit(double amount) {

         if (amount > 0){
                  balance += amount;
                  System.out.println("Το συνολικο ποσό του λογαριασμού σας ειναι: " + balance);
         } else {
                  System.out.println("Το πόσο πρέπει να είναι θετικός αρίθμος");
         }

    }

    public void withdraw(double amount)  {

         if (amount < balance) {
                 balance -= amount;
                 System.out.println("Το νεο υπόλοιπο του λογαριασμου σας ειναι: " + balance);
         } else {
                 System.out.println("Δεν μπορεί να πραγματοποιηθεί αυτή η συναλλαγή");
         }

    }

    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "JointAccount{" +
                "holder1='" + holder1 + '\'' +
                ", holder2='" + holder2 + '\'' +
                ", balance=" + balance +
                '}';
    }
}

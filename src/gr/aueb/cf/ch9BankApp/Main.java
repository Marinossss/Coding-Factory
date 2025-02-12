package gr.aueb.cf.ch9BankApp;

import gr.aueb.cf.ch9BankApp.model.JointAccount;
import gr.aueb.cf.ch9BankApp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        OverdraftAccount overdraftAccount = new OverdraftAccount(1000, 500);

        overdraftAccount.withdraw(200);
        System.out.println("Overdraft Account Details: " + overdraftAccount);

        System.out.println("=== Joint Account Transactions ===");

        JointAccount jointAccount = new JointAccount("Marinos", "Maria", 1000);

        jointAccount.deposit(400);
        jointAccount.withdraw(200);

        System.out.println("Joint Account Details: " + jointAccount);
    }
}

package gr.aueb.cf.bankapp;

import gr.aueb.cf.bankapp.model.JointAccount;
import gr.aueb.cf.bankapp.model.OverfraftAccount;

public class Main {

    public static void main(String[] args) {
        OverfraftAccount account = new OverfraftAccount(1000, 500);

        account.withdraw(200);
        System.out.println(account.toString());

//        System.out.println(account.getBalance());


        System.out.println("------------------------------");
        System.out.println("------------------------------");
        JointAccount snn124 = new JointAccount("Marinos", "Maria", 1000);

        snn124.deposit(400);
        snn124.withdraw(200);

        System.out.println(snn124.toString());
    }
}

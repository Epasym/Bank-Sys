package org.example;

import java.util.Scanner;

public class BankDetails {
    private String accno;
    private String accname;
    private String acctype;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount(){
        accno = "";
        while(accno.length()!=4){
            System.out.println("Enter account number (4 digits):");
            accno = sc.next();
        }
        System.out.println("Enter account name");
        accname = sc.next();
        System.out.println("Enter account type");
        acctype = sc.next();
        System.out.println("Enter Balance:");
        balance = sc.nextLong();
    }

    public void showAccount(){
        System.out.println("Account holder:" + accname);
        System.out.println("Account number:" + accno);
        System.out.println("Account type:" + acctype);
        System.out.println("Balance:" + balance);
    }

    public void deposit(){
        long amt;
        System.out.println("Deposit amount:");
        amt = sc.nextLong();
        balance += amt;
    }

    public void withdrawal(){
        long amt;
        System.out.println("Withdrawal amount:");
        amt = sc.nextLong();
        if(amt > balance){
            System.out.println("Transaction failed. Your balance is too low.");
        }else{
            balance -= amt;
            System.out.println("New balance:" + balance);
        }
    }

    public boolean search(String acno){
        if(acno.equals(accno)){
            this.showAccount();
            return true;
        }
        return false;
    }
}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many accounts do you want to open?");
        int n = sc.nextInt();
        BankDetails[] accounts = new BankDetails[n];
        int i;
        for(i = 0; i < n; i++){
            accounts[i] = new BankDetails();
            accounts[i].openAccount();
        }

        int opt;
        boolean found;
        String acno;
        do{
            System.out.println("\nBanking Application V1.0\n");
            System.out.println("1. Display all account details.\n2. Search for account by number.\n" +
                    "3. Deposit amount.\n4. Withdraw amount.\n5. Exit.");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    for(i = 0; i < n; i++){
                        accounts[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter account number:");
                    acno = sc.next();
                    for(i = 0; i < n; i++){
                        found = accounts[i].search(acno);
                        if(found){
                            break;
                        }
                    }

                case 3:
                    System.out.println("Enter account number:");
                    acno = sc.next();
                    for(i = 0; i < n; i++){
                        found = accounts[i].search(acno);
                        if(found){
                            accounts[i].deposit();
                            break;
                        }
                    }
                    System.out.println("Account not found!");
                    break;
                case 4:
                    System.out.println("Enter account number:");
                    acno = sc.next();
                    for(i = 0; i < n; i++){
                        found = accounts[i].search(acno);
                        if(found){
                            accounts[i].withdrawal();
                            break;
                        }
                    }
                    System.out.println("Account not found!");
                    break;
                case 5:
                    System.out.println("Goodbye!");
            }
        }while(opt!=5);
    }
}

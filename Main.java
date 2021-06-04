package com.company;

import java.util.Scanner;

/**
 *
 * @Basmala Mostafa
 */
public class Main {
    public static void main (String args []) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\n");
            System.out.println("Welcome in our Bank :");
            System.out.println("select one of the following choices ,please:");
            System.out.println("1-Make account in our bank");
            System.out.println("2-Make withdraw or deposit");
            System.out.println("3-Show your all account's information");
            System.out.println("4-Exit");
            System.out.print("\n");

                int choice1 = input.nextInt();
                if(choice1==4){
                    System.out.println("Thanks for using our service");
                    break;
                }
                switch (choice1) {
                    case 1:
                        Bank obj1 = new Bank();
                        obj1.addClient();
                        System.out.println("Your account is added successfully");
                        break;
                    case 2:
                        account obj2=new account();
                        System.out.println("select one of the following choices ,please:");
                        System.out.println("1-Make withdraw");
                        System.out.println("2-Make deposit");
                        System.out.println("3-Make over drafting");
                        System.out.println("4-return back to the main menu");
                        int choice2=input.nextInt();
                        if(choice2==1){
                            System.out.println("Enter your account num ,please:");
                            long account_num=input.nextLong();
                            System.out.println("Enter your balance ,please:");
                            double b=input.nextDouble();
                            obj2=new account(account_num,b);
                            System.out.println("Enter the amount which you need to withdraw ,please:");
                            double amount=input.nextDouble();
                            obj2.withdraw(amount);

                        }
                        else if(choice2==2){
                            System.out.println("Enter your account num ,please:");
                            long account_num=input.nextLong();
                            System.out.println("Enter your balance ,please:");
                            double b=input.nextDouble();
                            obj2=new account(account_num,b);
                            System.out.println("Enter the amount which you need to deposit ,please:");
                            double amount=input.nextDouble();
                            obj2.deposit(amount);
                        }
                        else if(choice2==3){
                            System.out.println("Enter your account num ,please:");
                            long account_num=input.nextLong();
                            System.out.println("Enter your balance ,please:");
                            double b=input.nextDouble();
                            obj2=new specialAccount(account_num,b);
                            System.out.println("Enter the amount which you need to withdraw ,please:");
                            double amount=input.nextDouble();
                            obj2.withdraw(amount);
                        }
                        else if(choice2==4){
                            break;
                        }
                        else{
                            System.out.println("Wrong choice ,please enter the right number:");
                        }
                        break;
                    case 3:
                        obj1=new Bank();
                        obj1.Display();
                        break;
                    default:
                        System.out.println("Wrong choice ,please enter the right number:");
                        break;
                }

        }

    }
}

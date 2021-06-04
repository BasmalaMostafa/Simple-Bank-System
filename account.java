package com.company;

public class account {


    long account_number;
    double  balance;


    public account (){
     account_number=0;
     balance=0.0f;
    }
    public account (long account_number,double balance){
        this.account_number=account_number;
        this.balance=balance;
    }

    public void deposit (double money) {
        balance +=money;
        System.out.println("you have deposited " + money);
        System.out.println("So your balance now is: "+balance);

    }

    public void withdraw (double money)
    {
        if(money< getBalance ()+1000 )
        {
            System.out.println("you have withdrawn "+ money);
            balance-=money;
            System.out.println("So your balance now is: "+balance);


        }
    }


    @Override
    public String toString() {
        return ("The account number is :"+account_number+ " The balance is: " + balance);
    }

    public final void setAccount_number (long account_number ) {
        this.account_number= account_number;
    }
    public long getAccount_number(){
        return  this.account_number;
    }
    public void setBalance (int balance ) {
        this.balance= balance;
    }
    public double getBalance()
    {
        return this.balance;
    }



}



 package com.company;

public class specialAccount extends account {


        public specialAccount() {
            super();
        }



        public specialAccount (long account_number,double balance)
        {
            super(account_number,balance);

        }
        public String toString() {
            return ("The account number is :"+account_number+ " The balance is: " + balance);
        }
        @Override
        public void deposit (double money) {
            balance +=money;
            System.out.println("you have deposited " + money);
            System.out.println("So your balance now is: "+balance);

        }
        @Override
        public void withdraw (double money)
        {
            if(money< getBalance ()+1000 )
            {
                System.out.println("you have withdrawn "+ money);
                balance-=money;
                System.out.println("So your balance now is: "+balance);


            }
        }


}

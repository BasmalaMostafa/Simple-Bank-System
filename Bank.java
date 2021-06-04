package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
    private String name;
    private String address;
    private long phone;
    static ArrayList<Client> Clients = new ArrayList<Client>();
    static ArrayList<account> Accounts = new ArrayList<account>();

    public Bank() { //Default constructor

    }

    public Bank(String name, String address, long phone) {
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setPhone(long phone) {

        this.phone = phone;
    }

    public long getPhone() {

        return phone;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getAddress() {

        return address;
    }

    void showAccountsData() {
        for (int i = 0; i < Accounts.size(); i++) {
            Accounts.get(i).toString();
        }
    }

    void showClientsData() {
        for (int i = 0; i < Clients.size(); i++) {
            Clients.get(i).toString();
        }
    }

    void addClient() {
        System.out.println("enter your name ,please:");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println("enter your address :");
        String add = n.nextLine();
        System.out.println("enter your phone:");
        long p = n.nextLong();
        System.out.println("enter your NationalID:");
        long ID=n.nextLong();
        System.out.println("1.account bank\n 2. commercial account ");
        int choice = n.nextInt();
        if (choice == 1) {
            System.out.println("enter your account number:");
            long accountNum = n.nextLong();
            System.out.println("enter your balance:");
            double ba=n.nextDouble();
            account b1=new account(accountNum,ba);
            Client c1=new Client(name,add,b1,p);

            System.out.println(Clients.add(c1));
            System.out.println(Accounts.add(b1));
        } else if (choice == 2) {
            System.out.println("your commerial account:");
            long  commercialNum=n.nextLong();
            System.out.println("enter your balance:");
            double ba1=n.nextDouble();
            account b2=new account(commercialNum,ba1);
            commercialClient co=new commercialClient(name,add,b2,commercialNum,ID);
            System.out.println(Clients.add(co));
            specialAccount b3=new specialAccount(commercialNum,ba1);
            System.out.println(Accounts.add(b3));

        }
    }

    void Display() {
        System.out.println("your account is :" +Clients.toString()+ "\n"+ Accounts.toString());
    }
    }


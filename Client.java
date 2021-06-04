package com.company;

public class Client  {
    private String name;
    private static long nationalID ;
    private String address;
    private account account_;

    public Client(){
        name="NO NAME";
        nationalID=0;
        address="NO ADDRESS";
    }
    public Client (String name ,String address ,account account_ ,long nationalID){
        this.account_=account_;
        this.address=address;
        this.name=name;
        this.nationalID=nationalID;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNationalID(long nationalID){
        this.nationalID=nationalID;
    }

    public long getNationalID() {
        return nationalID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAccount_(account account_) {
        this.account_ = account_;
    }

    public account getAccount_() {
        return account_;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nationalID=" + nationalID+
                ", address='" + address + '\'' +
                ", account_=" + account_ +
                '}';
    }

}

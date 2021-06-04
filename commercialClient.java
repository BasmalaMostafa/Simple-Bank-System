package com.company;

public class commercialClient extends Client{
    private long commercialID;


    public commercialClient(String name, String address, account account_, long commercialID,long nationalID) {
        super(name, address, account_, nationalID);
        this.commercialID=commercialID;
    }

    public void setCommercialID(long commercialID) {
        this.commercialID = commercialID;
    }

    public long getCommercialID() {
        return commercialID;
    }

    @Override
    public String toString() {
        return "commercialClient{" +
                "commercialID= " + commercialID +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", account_=" + getAccount_()+
                '}';
    }
}

package com.softycon.polymorphism.methodOverloading.constructorOverloading;

public class Registration {

    String customerName;
    String panCardNo;
    int voterID;
    String passportNo;
    int licenseNo;
    long[] telephoneNo;

    public String getCustomerName() {
        return customerName;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public int getVoterID() {
        return voterID;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }

    Registration(String customerName, String passportNo, long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, int licenseNo, String panCardNo, long[] telephoneNo){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, int voterID, int licenseNo, long[] telephoneNo){
        this.customerName = customerName;
        this.voterID = voterID;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, String panCardNo, int voterID, long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterID = voterID;
        this.telephoneNo = telephoneNo;
    }

    void displayRegistration(){
        System.out.println("Congratulations " + getCustomerName()
                + " !!!\nYou have been successfully registered for our services with the following details :- ");
    }

    void displayTelephone(){
        System.out.println("Telephone No : " + getTelephoneNo()[0] + " & " + getTelephoneNo()[1]);
    }
    void displayPassport(){
        System.out.println("Passport No : " + getPassportNo());
    }
    void displayPanCard(){
        System.out.println("Pan Card No : " + getPanCardNo());
    }
    void displayLicense(){
        System.out.println("License No : " + getLicenseNo());
    }
    void displayVoterID(){
        System.out.println("Voter ID : " + getVoterID());
    }
}

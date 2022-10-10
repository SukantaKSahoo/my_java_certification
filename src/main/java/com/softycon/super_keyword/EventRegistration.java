package com.softycon.super_keyword;

public class EventRegistration {
    protected String name;
    protected String nameOfEvent;
    protected double registrationFee;
    EventRegistration(String name, String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
    void registerEvent(){
        if(nameOfEvent == "ShakeALeg") {
            System.out.println("Base fee for the event is Rs. " + 100);
        } else if (nameOfEvent == "Sing&Win") {
            System.out.println("Base fee for the event is Rs. " + 150);
        } else if (nameOfEvent == "PlayAway") {
            System.out.println("Base fee for the event is Rs. " + 130);
        } else if (nameOfEvent == "Actathon") {
            System.out.println("Base fee for the event is Rs. " + 70);
        }
    }
}

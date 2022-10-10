package com.softycon.super_keyword;

public class TeamEventRegistration extends EventRegistration{
    int noOfParticipants;
    int teamNo;
    TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants){
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
    void registerEvent() {
        if(nameOfEvent == "ShakeALeg" || nameOfEvent == "Sing&Win" || nameOfEvent == "PlayAway" || nameOfEvent == "Actathon") {
            System.out.print("Thank You " + name + " for your participation. ");
            if (nameOfEvent == "Actathon") {
                System.out.println("Your registration fee is Rs. " + (noOfParticipants * 70));
            }
            if (nameOfEvent == "ShakeALeg") {
                System.out.println("Your registration fee is Rs. " + (noOfParticipants * 100));
            } else if (nameOfEvent == "Sing&Win") {
                System.out.println("Your registration fee is Rs. " + (noOfParticipants * 150));
            } else if (nameOfEvent == "PlayAway") {
                System.out.println("Your registration fee is Rs. " + noOfParticipants * 130);
            }
            System.out.println("You are team no : " + teamNo);
        } else
            System.out.println("Please choose a valid event");
    }
}

package com.softycon.super_keyword;

public class SingleEventRegistration extends EventRegistration {
    int participantNo;
    SingleEventRegistration(String name, String nameOfEvent, int participantNo){
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    void registerEvent() {
        if (nameOfEvent == "ShakeALeg" || nameOfEvent == "Sing&Win" || nameOfEvent == "PlayAway") {
            System.out.print("Thank You " + name + " for your participation. ");
            if (nameOfEvent == "ShakeALeg") {
                System.out.println("Your registration fee is Rs. " + 100);
            } else if (nameOfEvent == "Sing&Win") {
                System.out.println("Your registration fee is Rs. " + 150);
            } else if (nameOfEvent == "PlayAway") {
                System.out.println("Your registration fee is Rs. " + 130);
            }
            System.out.println("You are participant no : " + participantNo);
        } else {
            System.out.println("Please choose a valid event");
        }
    }
}

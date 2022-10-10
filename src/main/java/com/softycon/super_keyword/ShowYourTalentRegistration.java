package com.softycon.super_keyword;

public class ShowYourTalentRegistration {
    public static void main(String[] args){
        //TO-DO :Create an instance of SingleEventRegistration with reference of EventRegistration
        //as participant1, and initialize the same with values given
        EventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        //TO-DO :Invoke the method registerEvent using participant1
        participant1.registerEvent();
        //TO-DO :Create an instance of TeamEventRegistration with reference of EventRegistration
        //as team1, and initialize the same with values given
        EventRegistration team1 = new TeamEventRegistration("Aura", "Actathon", 1, 5);
        //TO-DO :Invoke the method registerEvent using team1
        team1.registerEvent();
        //TO-DO :Create an instance of SingleEventRegistration with reference of EventRegistration
        //as participant2, and initialize the same with values given
        EventRegistration single2 = new SingleEventRegistration("Hudson", "Actathon", 2);
        //TO-DO :Invoke the method registerEvent using participant2
        single2.registerEvent();
    }
}

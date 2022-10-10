package com.softycon.polymorphism.methodOverloading.constructorOverloading;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration kevin = new Registration("Kevin","MN9891N", new long[]{9452425421L, 7676765252L});
        kevin.displayRegistration();
        kevin.displayPassport();
        kevin.displayTelephone();
        System.out.println("============================================================");
        Registration julias =
                new Registration("Julias", 123, "PN7878", new long[]{2345615451L, 6763562562L});
        julias.displayRegistration();
        julias.displayLicense();
        julias.displayPanCard();
        julias.displayTelephone();
        System.out.println("============================================================");
        Registration jammy =
                new Registration("Jammy", 45453, 765, new long[]{9634524353L, 9887373737L});
        jammy.displayRegistration();
        jammy.displayVoterID();
        jammy.displayLicense();
        jammy.displayTelephone();
        System.out.println("============================================================");
        Registration rose =
                new Registration("Rose", "PN8934", 34356, new long[] {9867456367L, 7645367356L});
        rose.displayRegistration();
        rose.displayPanCard();
        rose.displayVoterID();
        rose.displayTelephone();
    }
}

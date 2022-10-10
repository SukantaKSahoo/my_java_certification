package com.softycon.constructor;

public class ChocolateTester {
    public static void main (String[] args){
        //Create an object of chocolate
        Chocolate chocolate = new Chocolate();
        //Use getter methods to display the values
        System.out.println("Name\t\t:\t" + chocolate.getName()
                + "\nBar Cade\t:\t" + chocolate.getBarCode()
                + "\nWeight\t\t:\t" + chocolate.getWeight()
                + "\nCost\t\t:\t" + chocolate.getCost());
        //Use setter methods to modify the values
        chocolate.setBarCode(102);
        chocolate.setName("Hershey's");
        chocolate.setWeight(24);
        chocolate.setCost(50);
        System.out.println("\n**************************\n");
        //Use getter methods to display the modified values
        System.out.println("Name\t\t:\t" + chocolate.getName()
                + "\nBar Cade\t:\t" + chocolate.getBarCode()
                + "\nWeight\t\t:\t" + chocolate.getWeight()
                + "\nCost\t\t:\t" + chocolate.getCost());
    }
}

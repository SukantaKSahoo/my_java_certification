package com.softycon.polymorphism.methodOverloading;

public class PlayerRatingTester {
    public static void main(String[] args) {
        PlayerRating beckham = new PlayerRating(1, "Beckham");
        PlayerRating oscar = new PlayerRating(2, "Oscar");

            beckham.criticOneRating = 9.9f;
            beckham.criticTwoRating = 9f;
            beckham.calculateAverageRating(beckham.criticOneRating, beckham.criticTwoRating);
            beckham.calculateCategory();
            beckham.display();
        System.out.println("=======================");
            oscar.criticOneRating = 1f;
            oscar.criticTwoRating = 1f;
            oscar.criticThreeRating = 1f;
            oscar.calculateAverageRating(oscar.criticOneRating, oscar.criticTwoRating, oscar.criticThreeRating);
            oscar.calculateCategory();
            oscar.display();
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import inheritance.restaurant.Restaurant;
import inheritance.restaurant.Review;

public class App {


    public static void main(String[] args) {

        Restaurant myRestaurant = new Restaurant();
        Restaurant competitorRestaurant = new Restaurant("Starbucks", 4.00f, 3);

        System.out.println(competitorRestaurant.toString());
        System.out.println(myRestaurant.toString());

        Review testReview1 = new Review("Juan", 5);
        Review testReview2 = new Review(new StringBuilder("worst experience ever food came out cold"), "Jose", 2);
        Review testReview3 = new Review(new StringBuilder("I did not get the food I ordered"), "Kimmy",1);


        System.out.println(testReview1.toString());
        System.out.println(testReview2.toString());

        competitorRestaurant.addReview(testReview1);
        competitorRestaurant.addReview(testReview2);
        competitorRestaurant.addReview(testReview3);


        System.out.println("__________-------------------____________");
        System.out.println(competitorRestaurant.toString());

    }
}
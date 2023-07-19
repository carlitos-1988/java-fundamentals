package inheritance.restaurant;

import java.util.ArrayList;

public class Restaurant extends Establishment {

    private String typeOfRestaurant;

    public Restaurant(String restaurantName, String typeOfRestaurant) {
        super(restaurantName);
        this.typeOfRestaurant = typeOfRestaurant;
    }

    public Restaurant(String restaurantName) {
        super(restaurantName);
        this.typeOfRestaurant = "undefined";
    }

    public Restaurant(String establishmentName, float rating, int price, ArrayList<Review> reviews, String typeOfRestaurant) {
        super(establishmentName, rating, price, reviews);
        this.typeOfRestaurant = typeOfRestaurant;
    }

    public Restaurant(String establishmentName, float rating, int price, String typeOfRestaurant) {
        super(establishmentName, rating, price);
        this.typeOfRestaurant = typeOfRestaurant;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "typeOfRestaurant='" + typeOfRestaurant + '\'' +
                "name of restaurant ='" + super.getEstablishmentName() + '\'' +
                "rating ='" + super.getRating() + '\'' +
                ", reviews=" + super.reviews.toString() +
                '}';
    }
}


//copied from today's class not used here just wanted to have this



//    static Integer iterateLinkedListIteratively(LinkedList<Integer> list) {
//
//        Integer largestValue = -1;
//
//        for (Integer element : list) {
//            if(element>largestValue){
//                largestValue = element;
//            }
//        }
//
//
//        return largestValue;
//    }

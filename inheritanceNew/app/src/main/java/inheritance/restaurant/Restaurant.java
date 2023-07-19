package inheritance.restaurant;

import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {

    private String restaurantName;
    private float rating;
    private int price;

    ArrayList<Review> reviews;

    public Restaurant() {
        this.rating =5.00f;
        this.reviews = new ArrayList<>();
    }


    public Restaurant(String restaurantName) {
        this.rating = 5.00f;
        this.restaurantName = restaurantName;
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String restaurantName, float rating, int price) {
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review){
        reviews.add(review);
        this.rating = updateRating(review);
    }

    public float updateRating(Review review) {

        float newRating = this.rating;
        int iteratedTimes = 1;

        if (this.rating == 0) {
            return review.getStarsGiven();
        } else {
            for (Review eachReview : this.reviews) {
                newRating += eachReview.getStarsGiven();
                iteratedTimes++;
            }
        }

        System.out.println(newRating + " " + iteratedTimes);
        return newRating/iteratedTimes;
    }

    @Override
    public String toString() {
        return "Restaurant{ " +
                "restaurantName ='" + this.restaurantName + '\'' +
                ", rating = " + this.rating +
                ", price = " + this.price +
                ", reviews ALL= " + this.reviews.toString() +
                '}';
    }

    static Integer iterateLinkedListIteratively(LinkedList<Integer> list) {

        Integer largestValue = -1;

        for (Integer element : list) {
            if(element>largestValue){
                largestValue = element;
            }
        }


        return largestValue;
    }
}

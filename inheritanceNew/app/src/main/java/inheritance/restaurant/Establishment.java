package inheritance.restaurant;

import java.util.ArrayList;

public class Establishment implements IBehaviors{

    private String establishmentName;
    private float rating;
    private int price;

    ArrayList<Review> reviews;

    public Establishment() {
        this.establishmentName = "No Name";
        this.rating = 5.00f;
        this.reviews = new ArrayList<>();
    }

    public Establishment(String establishmentName) {
        this.establishmentName = establishmentName;
        this.rating = 5.00f;
        this.reviews = new ArrayList<>();
    }

    public Establishment(String establishmentName, float rating, int price) {
        this.establishmentName = establishmentName;
        this.rating = rating;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Establishment(String establishmentName, float rating, int price, ArrayList<Review> reviews) {
        this.establishmentName = establishmentName;
        this.rating = rating;
        this.price = price;
        this.reviews = reviews;
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

        //System.out.println(newRating + " " + iteratedTimes);
        return newRating/iteratedTimes;
    }

    public void addReview(Review review){
        reviews.add(review);
        this.rating = updateRating(review);
    }

    public void setEstablishmentName(String businessName){
        this.establishmentName = businessName;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public float getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{ " +
                "establishment Name ='" + this.establishmentName + '\'' +
                ", rating = " + this.rating +
                ", price = " + this.price +
                ", reviews ALL= " + this.reviews.toString() +
                '}';
    }
}

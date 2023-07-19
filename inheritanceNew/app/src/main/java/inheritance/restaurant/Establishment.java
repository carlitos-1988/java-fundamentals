package inheritance.restaurant;

import java.util.ArrayList;

public class Establishment {

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
    }



    public Establishment(String establishmentName, float rating, int price, ArrayList<Review> reviews) {
        this.establishmentName = establishmentName;
        this.rating = rating;
        this.price = price;
        this.reviews = reviews;
    }
}

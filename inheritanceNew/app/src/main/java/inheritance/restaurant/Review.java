package inheritance.restaurant;

public class Review {

    private StringBuilder detailedReview;
    private String author;
    private int starsGiven;

    public int getStarsGiven() {
        return starsGiven;
    }

    public Review() {
    }

    public Review(String author, int starsGiven) {
        this.author = author;
        this.starsGiven = starsGiven;
    }

    public Review(StringBuilder detailedReview, String author, int starsGiven) {
        this.detailedReview = detailedReview;
        this.author = author;
        this.starsGiven = starsGiven;
    }

    @Override
    public String toString() {
        return "Review{ " +
                "detailedReview =" + this.detailedReview +
                ", author ='" +this.author + '\'' +
                ", starsGiven =" + this.starsGiven +
                '}';
    }
}

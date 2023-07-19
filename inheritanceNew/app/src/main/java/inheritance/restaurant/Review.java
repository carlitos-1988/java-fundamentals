package inheritance.restaurant;

public class Review {

    private StringBuilder detailedReview;
    private String author;
    private int starsGiven;


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


    public int getStarsGiven() {
        return starsGiven;
    }

    public StringBuilder getDetailedReview() {
        return detailedReview;
    }

    public void setDetailedReview(StringBuilder detailedReview) {
        this.detailedReview = detailedReview;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStarsGiven(int starsGiven) {
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

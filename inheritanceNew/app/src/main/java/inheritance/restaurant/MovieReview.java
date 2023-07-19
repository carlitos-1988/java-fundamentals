package inheritance.restaurant;

public class MovieReview extends Review{

    private String movieReviewed;

    public MovieReview() {
        super();
        this.movieReviewed = "none";
    }

    public MovieReview(String movieReviewed, String author, int starsGiven, StringBuilder detailedReview){
        super(detailedReview, author,starsGiven);
        this.movieReviewed = movieReviewed;

    }

    public MovieReview(String movieReviewed, String author, int starsGiven){
        super(author, starsGiven);
        this.movieReviewed = movieReviewed;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movieReviewed='" + movieReviewed + '\'' +
                "author='" + super.getAuthor() + '\'' +
                "stars given='" + super.getStarsGiven() + '\'' +
                "detailed review ='" + super.getDetailedReview() + '\'' +
                '}';
    }
}

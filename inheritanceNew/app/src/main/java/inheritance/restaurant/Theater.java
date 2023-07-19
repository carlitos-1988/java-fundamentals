package inheritance.restaurant;

public class Theater extends Establishment{

    private String theaterCity;

    public Theater() {
        super("Theater");
        this.theaterCity = "unknown";
    }
    public Theater(String theaterCity) {
        super("Theater");
        this.theaterCity = theaterCity;
    }

    public Theater(String establishmentName, float rating, int price, String theaterCity) {
        super(establishmentName, rating, price);
        this.theaterCity = theaterCity;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterName = '" + super.getEstablishmentName() + '\'' +
                "theater City = '" + theaterCity + '\'' +
                "theater rating= '" + super.getRating() + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}

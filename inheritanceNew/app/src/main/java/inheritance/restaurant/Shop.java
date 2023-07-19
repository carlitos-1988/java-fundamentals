package inheritance.restaurant;

public class Shop extends Establishment{

    private String typeOfShop;

    public Shop() {
        super();
        this.typeOfShop = "undefined";
    }


    public Shop(String storeName){
        super(storeName);
        this.typeOfShop = "not defined";
    }

    public Shop(String establishmentName, String typeOfShop) {
        super(establishmentName);
        this.typeOfShop = typeOfShop;
    }

    public Shop(String establishmentName, float rating, int price, String typeOfShop) {
        super(establishmentName, rating, price);
        this.typeOfShop = typeOfShop;
    }

    public void setTypeOfShop(String typeOfShop) {
        this.typeOfShop = typeOfShop;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop name='" + super.getEstablishmentName() + '\'' +
                "typeOfShop='" + typeOfShop + '\'' +
                "rating='" + super.getRating() + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}

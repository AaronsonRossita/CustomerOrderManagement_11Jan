import java.util.ArrayList;

public class Customer {

    private static int originalId = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private int discount;
    private ArrayList<Item> favoriteItems;
    private Giftable gift;

    public Customer(String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, int discount, ArrayList<Item> favoriteItems, Giftable gift) {
        this.id = originalId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
        this.favoriteItems = favoriteItems;
        this.gift = gift;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<Item> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(ArrayList<Item> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public void addFavItem(Item item){
        if (!favoriteItems.contains(item)){
            favoriteItems.add(item);
        }
    }

    public void removeFavItem(Item item){
        if (favoriteItems.contains(item)){
            favoriteItems.remove(item);
        }
    }

    public void takeGift(Giftable gift){
        this.gift = gift;
    }

    public void openGift(){
        this.gift.openGift();
    }
}

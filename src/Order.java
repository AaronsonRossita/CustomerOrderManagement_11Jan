import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Order implements Priceable{
    private static int originalId = 1;

    private int id;
    private String name;
    private String address;
    private ArrayList<Item> listOfItems;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private LocalDateTime orderDate;

    public Order(String name, String address, ArrayList<Item> listOfItems, Customer customer, PaymentType paymentType) {
        this.id = originalId++;
        this.name = name;
        this.address = address;
        this.listOfItems = listOfItems;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = LocalDateTime.now();
        addItemToFavItems();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
        addItemToFavItems();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate() {
        this.orderDate = LocalDateTime.now();
    }

    public void addItemToFavItems(){
        for(Item item : listOfItems){
            this.customer.addFavItem(item);
        }
    }

}

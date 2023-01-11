public class Item {
    private static int originalId = 1;

    private int id;
    private String itemName;
    private double itemPrice;

    public Item(String itemName, double itemPrice) {
        this.id = originalId++;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}

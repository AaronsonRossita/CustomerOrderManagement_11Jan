import java.util.ArrayList;

public class VipOrder extends Order{

    public VipOrder(String name, String address, ArrayList<Item> listOfItems, Customer customer, PaymentType paymentType) {
        super(name, address, listOfItems, customer, paymentType);
        this.setTotalPrice(calculateTotalPrice());
    }

    @Override
    public double calculateTotalPrice() {
        double sum = 0;
        for(Item item : this.getListOfItems()){
            sum += item.getItemPrice();
        }
        if (this.getCustomer().getCustomerType() == CustomerType.VIP){
            return sum - sum / 100 * this.getCustomer().getDiscount();
        }else{
            return sum;
        }
    }
}

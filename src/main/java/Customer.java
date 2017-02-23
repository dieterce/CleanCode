/**
 * Created by dieterp on 23/02/2017.
 */
public class Customer {


    private String customerName;
    private LoyaltyCard loyaltyCard;

    public Customer( String customerName) {

        this.customerName = customerName;
    }

    public Customer(String customerName, LoyaltyCard loyaltyCard) {
        this.customerName = customerName;
        this.loyaltyCard = loyaltyCard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}

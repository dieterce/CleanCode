
import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by pieterst on 23/02/2017.
 */
public class CustomerServices {
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private GroceriesRepository groceriesRepository;

    public void addToList(Customer customer) {
        customerRepository.getCustomerList().add(customer);
    }

    public List<Customer> getAllCustomers(){return customerRepository.getCustomerList();}

    public Customer getCustomerByLoyaltyCard(String barCode){
        Customer returnCustomer=null;
        for (Customer customer:getAllCustomers()){
            if(customer.getLoyaltyCard().getBarcode().equals(barCode)){
                returnCustomer=customer;
            }
        }
        return returnCustomer;
    }

    public void CreateGroceriesList(Customer customer){
        groceriesRepository = new GroceriesRepository(customer);
    }

    public void addGrocerie(Groceries groceries){
        groceriesRepository.addGrocerie(groceries);
    }

    public List<Groceries> getGroceriesByDate(LocalDate dateAsked){
        return groceriesRepository.getGroceriesByDate(dateAsked);
    }
}

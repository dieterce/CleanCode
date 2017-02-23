import javax.inject.Inject;

/**
 * Created by pieterst on 23/02/2017.
 */
public class CustomerServices {
    @Inject
    private CustomerRepository customerRepository;

    public void addToList(Customer customer) {
        customerRepository.getCustomerList().add(customer);
    }
}

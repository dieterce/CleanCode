import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieterst on 23/02/2017.
 */
@Named
public class CustomerRepository {
    private List<Customer> customerList= new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }


}

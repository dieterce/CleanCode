import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by pieterst on 23/02/2017.
 */
public class TestCustomerRepository {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    private Customer customer;
    private Customer customer2;
    @InjectMocks
    private CustomerServices customerServices;

    @Mock
    private CustomerRepository customerRepository;

    @Before
    public void setUp(){
        customer= new Customer("Pieter Sterckx");
        customer2= new Customer("Dieter",new LoyaltyCard("BarcodeDieter",0));
    }

    @Test
    public void CheckIfCustomerGetsAddedToList(){
        customerServices.addToList(customer);
        Assertions.assertThat(customerRepository.getCustomerList().size()==1);
    }

    @Test
    public void GetCustomerByLoyaltyCard_ReturnsCorrectCustomer(){
        customerServices.addToList(customer2);
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer("Dieter",new LoyaltyCard("BarcodeDieter",0)));
        Mockito.when(customerRepository.getCustomerList()).thenReturn(customers);
        Customer result=customerServices.getCustomerByLoyaltyCard("BarcodeDieter");

        Assertions.assertThat(result.getLoyaltyCard().getBarcode().equals("BarcodeDieter"));
        Assertions.assertThat(result.getLoyaltyCard().getBonuspoints()==0);
        Assertions.assertThat(result.getCustomerName().equals("Dieter"));
    }

}

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static com.sun.javaws.JnlpxArgs.verify;

/**
 * Created by pieterst on 23/02/2017.
 */
public class TestCustomerRepository {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    private Customer customer;
    @InjectMocks
    private CustomerServices customerServices;

    @Mock
    private CustomerRepository customerRepository;

    @Before
    public void setUp(){
        customer= new Customer("Pieter Sterckx");
    }
    @Test
    public void CheckIfCustomerGetsAddedToList(){
        long initial=customerRepository.getCustomerList().size();
        customerServices.addToList(customer);
        Assert.assertEquals(initial+1,(long)(customerRepository.getCustomerList().size());


    }

}

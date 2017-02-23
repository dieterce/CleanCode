import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroceriesRepository {
    private Customer customer;
    private LocalDate dateBought;
    private List<Groceries> groceriesList;

    public GroceriesRepository(Customer customer){
        this.customer=customer;
        this.dateBought=LocalDate.now();
        this.groceriesList=new ArrayList<>();
    }

    public void addGrocerie(Groceries grocerie){
        groceriesList.add(grocerie);
    }

    public List<Groceries> getGroceriesList(){
        return groceriesList;
    }

    public List<Groceries> getGroceriesByDate(LocalDate dateAsked){
        return groceriesList.stream().filter(dateBought -> dateBought.equals(dateAsked)).collect(Collectors.toList());
    }
}

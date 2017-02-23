import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by dieterp on 23/02/2017.
 */
public class Groceries {
    private int groceryArticleNr;
    private LocalDate buyingDateArticle;
    private int bonusPointsArticle;


    public Groceries() {

    }

    public Groceries(int groceryArticleNr) {
        this.groceryArticleNr = groceryArticleNr;
        this.buyingDateArticle = LocalDate.now();
    }

    public Groceries(int groceryArticleNr, int bonusPointsArticle) {
        this.groceryArticleNr = groceryArticleNr;
        this.buyingDateArticle = LocalDate.now();
        this.bonusPointsArticle = bonusPointsArticle;
    }

    
    public Groceries itemBoughtTheMost(List<Groceries> groceriesList)
    {
        Groceries Result = new Groceries();



        return Result;
    }
}

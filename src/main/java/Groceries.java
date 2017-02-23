import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by dieterp on 23/02/2017.
 */
public class Groceries {
    private int groceryArticleNr;
    private int bonusPointsArticle;


    public Groceries() {

    }

    public Groceries(int groceryArticleNr) {
        this.groceryArticleNr = groceryArticleNr;
    }

    public Groceries(int groceryArticleNr, int bonusPointsArticle) {
        this.groceryArticleNr = groceryArticleNr;
        this.bonusPointsArticle = bonusPointsArticle;
    }

    public int getGroceryArticleNr() {
        return groceryArticleNr;
    }

    public int getBonusPointsArticle() {
        return bonusPointsArticle;
    }
}

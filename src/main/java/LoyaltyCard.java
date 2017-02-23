/**
 * Created by dieterp on 23/02/2017.
 */
public class LoyaltyCard {

    private String barcode;
    private int bonuspoints;


    public LoyaltyCard(String barcode, int bonuspoints) {
        this.barcode = barcode;
        this.bonuspoints = bonuspoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonuspoints() {
        return bonuspoints;
    }
}

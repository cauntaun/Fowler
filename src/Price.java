/**
 * Created by Henning on 27.04.2016.
 */
abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}

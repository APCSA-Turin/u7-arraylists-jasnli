package TRAVERSE_THEM;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double sum = 0;
        for (MenuItem item : check) {
            sum += item.getPrice();
        }
        return sum;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        boolean dS = false;
        for (MenuItem item : check) {
            if (item.isDailySpecial()) {
                dS = true;
            }
        }
        if (totalPrices() < 40 || dS) {
            return false;
        } else {
            return true;
        }
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        double fc = totalPrices();
        if (couponApplies()) {
            fc *= 0.75;
        }
        int eC = 0;
        for (MenuItem item : check) {
            if (item.isEntree()) {
                eC ++;
            }
        }
        if (eC >= 6) {
            fc += .2 * totalPrices();
        }
        return fc;
    }
}

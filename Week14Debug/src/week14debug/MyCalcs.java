/* SDEV 250 ~ Java Programming I
 * Author Name: steven.hickey
 * Assignment Name: week14debug
 * Date: Oct 1, 2014
 * Description: Subclass for debugging exercise
                Based on Week 6 Assignment

 */
package week14debug;

/* Begin Class MyCalcs */
public class MyCalcs {

    /* Variable declarations */
    private double prev, curr, use; //Error 29? --changed to double
    private final double RATE_A = .0809, RATE_B = .091, RATE_C = .109, TAX_R = .0346;
    private double rate, sub, tax, tot;

    /* Constructor initializes default set in main class. */
    MyCalcs(double prv, double cur) { 
        prev = prv;
        curr = cur;
    }

    /* Set methods*************************************************************/
    /* Set usage */
    public void setUsage() {
        use = curr - prev; //Error 21- changed order.
    }

    /* Set rate */
    public void setRate() {
        if (use <= 500) {
            rate = RATE_A;
        } else if (use > 500 && use <= 900) { //Error 34?- change sign and adjusted condition
            rate = RATE_B;
        } else {
            rate = RATE_C;
        }
    }

    /* Set subtotal */
    public void setSubTot() {
        sub = use * rate;
    }

    /* Set taxes */
    public void setTax() {
        tax = sub * TAX_R; //Error 25? - Changed to the right formula
    }

    /* Set total bill */
    public void setTot() {
        tot = tax + sub; //Error 24?- changed to plus
    }

    /* Get methods*************************************************************/
    /* Get Usage */
    public double getUsage() {
          //Error 8? - deleted use = use
         return use;
    }

    /* Get rate */
    public double getRate() {
        return rate; //Error 23? - Changed to rate
    }

    /* Get subtotal */
    public double getSubTot() {
        return sub; //Error 24?- Changed to sub
    }

    /* et taxes */
    public double getTax() {
        return tax;
    }

    /* Get total */
    public double getTot() {
        return tot;
    }

} /* End Class MyCalcs */
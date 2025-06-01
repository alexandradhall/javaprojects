package ahall_week9;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week9
 * @Date: Mar 25, 2021
 * @Subclass MyUtility Description:
 */
//Imports
//Begin Subclass MyUtility
public class MyUtility {

    //Variables
    double current;
    double rate;
    double subtotal;
    double tax;
    double total;

    /**
     * Constructor
     * @param first
     * @param second 
     */
    public MyUtility(double first, double second) {
        setUtility(first, second);
    }

    /**
     * Default constructor
     */
    public MyUtility() {
        this(0, 0);
    }

    /**
     * Call to set values for set methods
     * @param first
     * @param second 
     */
    private void setUtility(double first, double second) {
        setUsage(first, second);
        setRate();
        setSubtotal();
        setTaxes();
        setTotal();
    }

    /**
     * Set current usage
     * @param first
     * @param second 
     */
    private void setUsage(double first, double second) {

        current = second - first;
    }

    /**
     * Set rate
     */
    private void setRate() {
        if (current <= 500) {
            rate = 0.0809;
        } else if (current >= 501 && current <= 900) {
            rate = 0.091;
        } else {
            rate = 0.109;
        }
    }

    /**
     * determines subtotal
     */
    private void setSubtotal() {
        subtotal = rate * current;
    }

    /**
     * Determines the taxes
     */
    private void setTaxes() {
        tax = subtotal * 0.0346;
    }

    /**
     * Determines total
     */
    private void setTotal() {
        total = subtotal + tax;
    }

    /**
     * Get current usage
     * @return 
     */
    public double getUsage() {

        return current;

    }

    /**
     * Gets rate
     * @return 
     */
    public double getRate() {
        return rate;
    }

    /**
     * Get subtotal
     * @return 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * get taxes
     * @return 
     */
    public double getTaxes() {
        return tax;
    }
    
    /**
     * Get total
     * @return 
     */
    public double getTotal(){
        return total;
    }
} //End Subclass MyUtility

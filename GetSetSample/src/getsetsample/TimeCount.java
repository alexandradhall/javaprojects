package getsetsample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven Hickey
 * @Assignment Name: getsetsample
 * @Date: Jun 11, 2015
 * @Description: Simple subclass with set and get methods
 */
//Imports
//Begin Class TimeCount
public class TimeCount {

    /**
     Make some declarations that are private to the subclass here.
     Use final to set the default hours. These will not change and
     their values do not need to be revealed to the main class; thus the 
     'private'
     Note: Month assumes a 30 day month in this example. Simple subclass with set
     and get methods
     */
    private final int HRS = 24;
    private final int WK = 168;
    private final int MONTH = 720;
    int numD;
    int numW;
    int numM;

    /**
     * Constructor - call to set value passed from main
     * @param num 
     */
    public TimeCount(int num) {
        setTime(num);
    }

    /**
     * Constructor - Initializes default value of 0
     */
    public TimeCount() {
        this(0);
    }

    /**
     * Calls to set values for set methods
     * @param num 
     */
    private void setTime(int num) {
        setDays(num);
        setWeeks(num);
        setMonths(num);
    }

    //Set methods***************************************************************
    /**
     The set methods are used to derive an answer. The sets are void methods, so 
     they do not return data. They simply act upon what is sent to them and
     assign the new value to a variable. These are declared as private because
     the initial setup in main does not need to access them directly.
     */

    /**
     * Determine hours in number of days entered
     * setDays is called from setTime above and the value num is passed into the new
     * value h. h is multiplied by the final variable hrs to derive the total number
     * of hours. The process repeats for other set methods.
     * @param h 
     */
    private void setDays(int h) {
        numD = h * HRS;
    }

    /**
     * Determine hours in number of weeks entered
     * @param w 
     */
    private void setWeeks(int w) {
        numW = w * WK;
    }

    /**
     * Determine hours in number of months entered
     * @param m 
     */
    private void setMonths(int m) {
        numM = m * MONTH;
    }

    //Get methods***************************************************************
    /**
     The get methods are merely a way to call the results after they have been set
     & derived within the set methods above. They are not of type void so they
     must return a value.
     */
    /**
     * Get hours in days
     * @return 
     */
    public int getDays() {
        return numD;
    }

    /**
     * Get hours in weeks
     * @return 
     */
    public int getWeeks() {
        return numW;
    }

    /**
     * Get hours in months
     * @return 
     */
    public int getMonths() {
        return numM;
    }

} //End Class TimeCount

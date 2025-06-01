package ahall_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Struck Description: Super class of percussion
 */
//Imports
//Begin Subclass Struck
public abstract class Struck extends Instrument {

    //Variables
    String struck;

    /**
     * Default Constructor
     */
    public Struck() {
        this.struck = "Mystery struck instrument";
    }

    /**
     * Constructor
     * @param struck
     */
    public Struck(String struck) {
        this.struck = struck;
    }

    /**
     * Method setStruck: set struck variable
     * @param struck 
     */
    public void setStruck(String struck) {
        this.struck = struck;
    }

     /**
     * Method getStruck: Concatenates string and returns for array.
     * @return struck
     */
    public String getStruck() {

        struck = "The " + struck + " is an struck instrument and is struck.";
        return struck;
    }
} //End Subclass Struck

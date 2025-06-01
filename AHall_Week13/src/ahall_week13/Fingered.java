package ahall_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Fingered Description: Super class for strings
 */
//Imports

//Begin Subclass Fingered
public abstract class Fingered extends Instrument {

    //Variables
    String fingered;

    /**
     * Default Constructor
     */
    public Fingered() {
        this.fingered = "Mystery fingered instrument";
    }

    /**
     * Constructor
     * @param fingered 
     */
    public Fingered(String fingered) {
        this.fingered = fingered;
    }

    /**
     * Method setFingered: set fingered variable
     * @param fingered 
     */
    public void setFingered(String fingered) {
        this.fingered = fingered;
    }

    /**
     * Method getFingered: Concatenates string and returns for array.
     * @return fingered
     */
    public String getFingered() {

        fingered = "The " + fingered + " is a fingered instrument and is played "
                + "with fingers";
        return fingered;
    }
} //End Subclass Fingered

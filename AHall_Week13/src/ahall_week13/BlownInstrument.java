package ahall_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass BlownInstrument Description: Super class for Woodwind and Brass
 */
//Imports
//Begin Subclass BlownInstrument
public abstract class BlownInstrument extends Instrument {

    //variables
    String blownInstrument;

    /**
     * Default Constructor
     */
    public BlownInstrument() {
        this.blownInstrument = "Mystery blown instrument";
    }
    
    /**
     * Constructor
     * @param blownInstrument 
     */
    public BlownInstrument(String blownInstrument) {
        this.blownInstrument = blownInstrument;
    }

    /**
     * Method setBlownInstrument: set blownInstrument variable
     * @param blownInstrument 
     */
    public void setBlownInstrument(String blownInstrument) {
        this.blownInstrument = blownInstrument;
    }

    /**
     * Method getBlownInstrument: Concatenates string and returns for array.
     * @return blownInstrument
     */
    public String getBlownInstrument() {

        blownInstrument = "The " + blownInstrument + " is a blown instrument and "
                + "is played by mouth";
        return blownInstrument;
    }
} //End Subclass BlownInstrument

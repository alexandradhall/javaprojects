package ahall_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Instrument Description: Superclass of all the instruments
 */
//Imports
import java.util.*;
//Begin Subclass Instrument

public abstract class Instrument {

    //variables
    protected String instrument;

    /**
     * Default Constructor
     */
    public Instrument() {
        this.instrument = "Mystery instrument";
    }

    /**
     * Constructor
     * @param instrument
     */
    public Instrument(String instrument) {
        this.instrument = instrument;
    }

    /**
     * Method setInstrument: set Instrument variable
     * @param instrument 
     */
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    /**
     * Method getInstrument: Concatenates string and returns for array.
     * @return instrument
     */
    public String getInstrument() {
        
        instrument = "The "+ instrument + " is an instrument and is played by you.";
        return instrument;
    }
} //End Subclass Instrument

package ahall_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Woodwind Description: Subclass of blown instruments
 */
//Imports
//Begin Subclass Woodwind
public class Woodwind extends BlownInstrument {

    //Variables
    String woodwind;

    /**
     * Default Constructor
     */
    public Woodwind() {
        this.woodwind = "Mystery woodwind";
    }

    /**
     * Constructor
     * @param woodwind
     */
    public Woodwind(String woodwind) {
        this.woodwind = woodwind;
    }

    /**
     * Method setWoodwind: set woodwind variable
     * @param woodwind 
     */
    public void setWoodwind(String woodwind) {
        this.woodwind = woodwind;
    }

    /**
     * Method getWoodwind: Concatenates string and returns for array.
     * @return woodwind
     */
    public String getWoodwind() {

        woodwind = "The " + woodwind + " is a woodwind and is played by mouth";
        return woodwind;
    }
} //End Subclass Woodwind

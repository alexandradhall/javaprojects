package ahall_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Percussion Description: subclass of struck
 */
//Imports

//Begin Subclass Percussion
public class Percussion extends Struck {
    
    //variables
    String percussion;

    /**
     * Default Constructor
     */
    public Percussion() {
        this.percussion = "Mystery percussion instrument";
    }

    /**
     * Constructor
     * @param percussion
     */
    public Percussion(String percussion) {
        this.percussion = percussion;
    }

    /**
     * Method setPercussion: set percussion variable
     * @param percussion 
     */
    public void setPercussion(String percussion) {
        this.percussion = percussion;
    }

     /**
     * Method getPercussion: Concatenates string and returns for array.
     * @return percussion
     */
    public String getPercussion() {

        percussion = "The " + percussion + " is an percussion instrument and is "
                + "percussion.";
        return percussion;
    }

} //End Subclass Percussion

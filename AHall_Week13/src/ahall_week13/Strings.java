package ahall_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Strings Description: Sub class of fingered class
 */
//Imports

//Begin Subclass Strings
public class Strings extends Fingered {

    //variables
    String string;
    
    /**
     * Default Constructor
     */
    public Strings() {
        this.string = "Mystery string instrument";
    }

    /**
     * Constructor
     * @param string
     */
    public Strings(String string) {
        this.string = string;
    }

    /**
     * Method setStrings: set string variable
     * @param string 
     */
    public void setStrings(String string) {
        this.string = string;
    }

    /**
     * Method getStrings: Concatenates string and returns for array.
     * @return string
     */
    public String getStrings() {

        string = "The " + string + " is a string instrument and is played "
                + "with fingers";
        return string;
    }
} //End Subclass Strings

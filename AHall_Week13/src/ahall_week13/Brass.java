package ahall_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Subclass Brass Description: subclass of blown instrument
 */
//Imports

//Begin Subclass Brass
public class Brass extends BlownInstrument {
    
    //Variables
    String brass;

    /**
     * Default Constructor
     */
    public Brass() {
        this.brass = "Mystery brass";
    }

    /**
     * Constructor
     * @param brass
     */
    public Brass(String brass) {
        this.brass = brass;
    }

    /**
     * Method setBrass: set brass variable
     * @param brass 
     */
    public void setBrass(String brass) {
        this.brass = brass;
    }

    /**
     * Method brass: Concatenates string and returns for array.
     * @return brass
     */
    public String getBrass() {

        brass = "The " + brass + " is a brass and is played by mouth";
        return brass;
    }

} //End Subclass Brass

package abstractsample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven
 * @Assignment Name: abstractsample
 * @Date: Jul 18, 2015
 * @Subclass Automatic Description: Subclass to abstracted super class Tranmission
 */
//Imports
//Begin Subclass Automatic
public class Automatic extends Transmission {

    /**
     * Default constructor
     */
    public Automatic() {
        super();
        this.name = "car";
        this.transType = "automatic";
    }

    /**
     * Constructor for user entered data
     * @param cName 
     */
    public Automatic(String cName) {
        super();
        this.name = cName;
        this.transType = "automatic";
    }

    /**
     * Override method from super class Vehicle
     */
    @Override
    public void start() {
        if (transType.equalsIgnoreCase("automatic")) {
            System.out.printf("An %s %s is starting...vrrrooom!\n", transType, name);
        } else {
            System.out.printf("A %s %s is starting...vrrrooom!\n", transType, name);
        }
    }
    
} //End Subclass Automatic

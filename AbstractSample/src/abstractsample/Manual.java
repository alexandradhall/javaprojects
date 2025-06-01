package abstractsample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven
 * @Assignment Name: abstractsample
 * @Date: Jul 18, 2015
 * @Subclass Manual Description: Subclass to abstracted super class Tranmission
 */
//Imports
//Begin Subclass Manual
public class Manual extends Transmission {

    /**
     * Default constructor
     */
    public Manual() {
        super();
        this.name = "stick-shift";
        this.transType = "manual";
    }

    /**
     * Constructor for user entered data
     * @param transType 
     */
    public Manual(String transType) {
        super();
        this.name = transType;
        this.transType = "manual";
    }

    /**
     * Override method from super class Vehicle
     */
    @Override
    public void start() {
        System.out.printf("A %s %s is starting...vrrrooom!\n", transType, name);
    }
} //End Subclass Manual

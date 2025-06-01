package abstractsample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven
 * @Assignment Name: abstractsample
 * @Date: Jul 18, 2015
 * @Subclass Color Description: Subclass to abstract class Color. Color is
 * abstracted subclass to concrete class Vehicle.
 */
//Imports
//Begin Subclass Color
public class Color extends CarColor {

    /**
     * Method Color. Takes no parameters. Hard-coded values.
     */
    public Color() {
        super();
        this.name = "Ferrari";
        this.carColor = "red";
        this.trans = "manual";
    }

    /**
     * Overloaded method Color. Takes parameters
     * @param cName
     * @param cColor
     * @param cTrans 
     */
    public Color(String cName, String cColor, String cTrans) {
        super();
        this.name = cName;
        this.carColor = cColor;
        this.trans = cTrans;
    }

    /**
     * Overridden method start. Method is overridden because it was implemented
     * in super class Vehicle
     */
    @Override
    public void start() {
        System.out.printf("A %s %s %s is starting...vrrrooom!\n", carColor, trans, name);
    }

} //End Subclass Color

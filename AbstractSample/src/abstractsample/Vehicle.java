package abstractsample;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven
 * @Assignment Name: abstractsample
 * @Date: Jul 18, 2015
 * @Subclass Vehicle Description: Abstracted super class. Has implementations
 */
//Imports

//Begin Subclass Vehicle
public abstract class Vehicle {
    
    /**
     * Variables that need to be hidden or protected
     */
    protected String name;
    protected String trans;
    
    /**
     * An abstracted method that can be utilized by subclasses
     */
    abstract public void start();

} //End Subclass Vehicle
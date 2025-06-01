package interfaceSample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: steven.hickey
 * @Assignment Name: interfaceSample
 * @Date: Jul 20, 2015
 * @Description: A simple shutdown process to show implementation of interface
 * subclasses.
 */
//Imports
//Begin Class Interface
public class Interface {

    //Begin Main Method
    public static void main(String[] args) {

        /* Variable */
        String ans;

        /* New scanner object */
        Scanner yn = new Scanner(System.in);

        /* Create new instance of subclass */
        ShutDown object = new ShutDownSystem();

        System.out.print("Shutdown HiVac chamber? Y or N ->: ");
        ans = yn.nextLine();
        if (ans.equalsIgnoreCase("n")) {
            System.out.println("Shut down process canceled.");
        } else if (ans.equalsIgnoreCase("y")) {
            object.shutDown();  /* Call shutdown method */
        } else {
            System.out.println("You must enter either Y or N");
        }
    } //End Main Method
} //End Class Interface

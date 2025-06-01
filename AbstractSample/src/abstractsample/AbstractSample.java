package abstractsample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven
 * @Assignment Name: abstractsample
 * @Date: Jul 18, 2015
 * @Description: Simple abstract class example
 */
//Imports
import java.util.Scanner;

//Begin Class AbstractSample
public class AbstractSample {

    //Begin Main Method
    public static void main(String[] args) {

        /* Local variables */
        String autoMake;
        String manMake;
        String autoColor;
        String manColor;

        /* New Scanner object */
        Scanner sc = new Scanner(System.in);

        /* Use hard coded values to create instances of non abstract subclasses */
        Automatic auto = new Automatic();
        Manual stick = new Manual();
        Color carColor = new Color();

        /* Call overriden start methods without user data */
        auto.start();
        stick.start();
        carColor.start();

        /* Use user input values */
        System.out.print("Enter an automatic car's make: ");
        autoMake = sc.nextLine();
        System.out.printf("Enter the %s's color: ", autoMake);
        autoColor = sc.nextLine();

        System.out.print("Enter a manual car's make: ");
        manMake = sc.nextLine();
        System.out.printf("Enter the %s's color: ", manMake);
        manColor = sc.nextLine();

        /**
         * Create instances of non abstract subclasses and provide user entered
         * data. One instance for automatic transmissions, one for manual. Must
         * call overridden start method after each instance since they call the
         * same method after being created.
         */
        carColor = new Color(autoMake, autoColor, "automatic");
        carColor.start();
        carColor = new Color(manMake, manColor, "manual");
        carColor.start();

    } //End Main Method

} //End Class AbstractSample

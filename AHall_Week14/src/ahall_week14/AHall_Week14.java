package ahall_week14;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week14
 * @Date: Apr 25, 2021
 * @Description: Program with multiple errors for debugging purposes. Based on
 * Week 6 Assignment
 */
import java.util.InputMismatchException;
//error 1
import java.util.Scanner;

//Begin Class Week14Debug
public class AHall_Week14 {

    //Begin Main Method
    public static void main(String[] args) throws InputMismatchException { //Error 16? - added throws exception

        //New Scanner object
        Scanner sc = new Scanner(System.in); //Error 2

        //Declare variables
        double prev = 0; //Error 28?changed to double
        double curr = 0;//error 3 - curr, double, initialize
        //int wrg = 0;  /*error 6- delete wrg*/
        String ans = "Y";
        boolean flag1 = false, YesNo;

        //Ask user for input and receive it
        System.out.println("Welcome to the City Power Bill Calculator!");

        //Begin while loop
        do {
            do {
                /* Begin internal do loop */

                try {
                    /* Try/Catch block beginning */

                    System.out.print("Please enter your previous meter reading: ");
                    prev = sc.nextDouble(); //Error 32? double

                } catch (InputMismatchException IME) {
                    System.err.printf("Exception: %s\n", IME);
                    errCall();
                    /* Call error message */ //Error 13? - edit errCall to work properly
                    sc.nextLine();
                    /* Clear buffer */

                }
                /* End Try/Catch block */

            } while (flag1);
            /* End internal do loop */


            do {
                /* Begin internal do loop */

                try {
                    /* Try/Catch block beginning */

                    System.out.print("Please enter your current meter reading: ");
                    curr = sc.nextDouble(); //Error 31- double
                    if (prev > curr)/*error 4- defined prev with initial variable*/ {
                        /* Check for previous reading < current reading */
                        System.out.print("Your current entry must be higher than your previous!\n");
                        flag1 = true;
                    } else {
                        flag1 = false; //Error 22?- Added missing flag change
                    }
                } catch (InputMismatchException IME) {
                    System.err.printf("Exception: %s\n", IME);
                    /*Error 5- ;*/
                    errCall();
                    /* Call error message */ //Error 14?- Edit errCall to work properly.
                    sc.nextLine();
                    /* Clear buffer */
                    flag1 = true;
                }
                /* End Try/Catch block */

            } while (flag1);
            /* End internal do loop */

            //New instance of the subclass & set current and previous values
            MyCalcs myCalcs = new MyCalcs(prev, curr); //Error 22?- changed wrg to curr

            //Set usage and call it for output
            myCalcs.setUsage();
            System.out.printf("Your usage was: %.1fKwHs\n", myCalcs.getUsage());
            /*Error 7- changed return type in MyCalcs, Error 9 changed type of print statement*/

            //Set rate and call it for output
            myCalcs.setRate();
            System.out.printf("Your rate is: $%.4f/KwH\n", myCalcs.getRate());

            //Set subtotal and call it for output
            myCalcs.setSubTot();
            System.out.printf("Your subtotal is: $%.2f\n", myCalcs.getSubTot());
            /*Error 10- added parenthesis and edited message*/

            //Set taxes and call them for output
            myCalcs.setTax();
            System.out.printf("Your taxes are: $%.2f\n", myCalcs.getTax());/*Error 11- changed d to f*/

            //Set total bill and call it for output
            myCalcs.setTot();
            System.out.printf("Your total bill this month is: $%.2f\n", myCalcs.getTot()); //Error 12- change set to get

            //Run again? Validate answer. Begin inner loop.
            do {
                System.out.print("Calculate a new usage? \n(Y for Yes, N for No): ");
                ans = sc.next();
                if (!(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N"))) { //Error 19?- change equals to equalsIgnoreCase
                    YesNo = true;
                    /* reset incase of previous good run *///Error 17- added ending */ to comment
                    System.err.println("Exception!\nPlease enter only a Y for Yes or an N for No.");
                } else if (ans.equalsIgnoreCase("Y")) { //Error 20?- change equals to equalsIgnoreCase
                    YesNo = false;
                } else {
                    System.out.println("Thank you for using the program!\nGood Bye!");
                    YesNo = false;
                }
            } while (YesNo); // End inner loop Error 18? - do while
        } while (ans.equalsIgnoreCase("Y"));//End outer while loop Error27?- ignore case

    } //End Main Method

    //Method to output error message
    private static void errCall() { //Error 15? -change to private
        System.err.println("You must enter a numeric value. Please try again.\n");
    }
} //End Class AHall_Week14

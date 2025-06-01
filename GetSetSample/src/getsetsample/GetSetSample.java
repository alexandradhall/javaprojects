package getsetsample;
/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven Hickey
 * @Assignment Name: getsetsample
 * @Date: Jun 11, 2015
 * @Description: Simple get and set method program to determine hours in day(s),
 * week(s) and month(s).
 */
//Imports
import java.util.Scanner;

//Begin Class GetSetSample
public class GetSetSample {

    //Begin Main Method
    public static void main(String[] args) {

        //New Scanner object
        Scanner sc = new Scanner(System.in);

        //Declarations
        int nums;

        //Welcome statement
        System.out.println("This program will determine the number of hours\nfor days, "
                + "weeks, and months entered.");
        
        //Ask for input from user
        System.out.print("\nPlease enter a number: ");
        nums = sc.nextInt();
        
        //New instance of the subclass and constructor. Send input to subclass
        TimeCount myTC = new TimeCount(nums);
        /**
         Because you have already set the days in the line above, you can now
         retrieve the final value
         */
        System.out.printf("There are %d hours in %d day(s).\n", myTC.getDays(), nums);
        System.out.printf("There are %d hours in %d week(s).\n", myTC.getWeeks(), nums);
        System.out.printf("There are %d hours in %d month(s).\n", myTC.getMonths(), nums);
        
        /**
        Conversely, you can set the values individually as shown below. You can 
        comment out lines 33 - 41 above and uncomment lines 50 - 61 below to see 
        the results. Simply highlight the lines you want to comment (or uncomment)
         and select Source -> Toggle Comment from the menu at the top of NetBeans.
        If you decide to try this, you must change the set methods in the subclass
        to public or you will have errors.
        */
        
//        //New instance of the subclass and constructor.
//        TimeCount myTC = new TimeCount();
//        
//        //Set each value
//        myTC.setDays(nums);
//        myTC.setWeeks(nums);
//        myTC.setMonths(nums);
//        
//        //Get the derived values
//        System.out.printf("There are %d hours in %d day(s).\n", myTC.getDays(), nums);
//        System.out.printf("There are %d hours in %d week(s).\n", myTC.getWeeks(), nums);
//        System.out.printf("There are %d hours in %d month(s).\n", myTC.getMonths(), nums);
        
    } //End Main Method

} //End Class GetSetSample

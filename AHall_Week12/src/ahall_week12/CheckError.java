package ahall_week12;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week12
 * @Date: Apr 17, 2021
 * @Subclass CheckError Description: Validates user input.
 */
//Imports
//Begin Subclass CheckError
public class CheckError {
    // Instance variables
    private boolean flag;
    /**
     *
     * Method setYesNo: Used to set result for checking proper entry of Yes or
     *No to continue program. Method is overloaded
     *
     * @param ans
     * @param exit
     *
     */
    public void setYesNo(String ans, boolean exit) {

        if (!(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N"))) {
            System.err.println("Exception!\nPlease enter only a Y for Yes or "
                    + "an N for No.");
            flag = false;

        } else if (ans.equalsIgnoreCase("y")) {
            System.out.println();
            flag = true;
        } else if (ans.equalsIgnoreCase("n") && !exit) {
            System.out.println();
            flag = true;
        } else {
            System.out.println("Thank you for using the program!\nGood Bye!");
            flag = true;
        }
    }

    /**
     *
     * Method setYesNo: Used to set result for checking proper entry of Yes or
     * No
     *
     * @param ans
     *
     */
    public void setYesNo(String ans) {

        if (!(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N"))) {
            System.err.println("Exception!\nPlease enter only a Y for Yes or an N for No.");
            flag = false;
        } else if (ans.equalsIgnoreCase("y")) {
            flag = true;
        } else {
            flag = false;
        }
    }

    /**
     *
     * Method setRange: Used to set method to check for menu range
     *
     * @param x
     * @param minVal
     * @param maxVal
     * 
     */
    public void setRange(int x, int minVal, int maxVal) {
        if ((x < minVal) || (x > maxVal)) {
            System.out.println("Please enter a choice between " + minVal 
                    + " and " + maxVal + " (both inclusive");
            flag = false;
        } else {
            flag = true;
        }
    }
    
    /**
     *
     * Method getYesNo: Return boolean value for loop in main that checks for
     * proper entry
     *
     * @return
     *
     */
    public boolean getYesNo() {
        return flag;
    }

    /**
     *
     * Method getRange: Return boolean value for menu range checking
     *
     * @return
     *
     */
    public boolean getRange() {
        return flag;
    }
    
} //End Subclass CheckError

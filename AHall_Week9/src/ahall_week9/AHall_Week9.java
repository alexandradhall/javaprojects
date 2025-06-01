package ahall_week9;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week9
 * @Date: Mar 25, 2021
 * @Description:week 6 program and implement a subclass to handle the 
 * calculations.
 */
//Imports
import java.util.Scanner;
//Begin Class AHall_Week9

public class AHall_Week9 {

    //Begin Main Method
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        //variables
        double first;
        double second;
        char cont;

        System.out.println("Welcome to the City Power Bill Calculator! ");

        do {
            System.out.print("Please enter your previous meter reading: ");
            first = input.nextDouble();
            System.out.print("Please enter your current meter reading: ");
            second = input.nextDouble();
            MyUtility utility = new MyUtility(first, second);
            
            System.out.printf("Your usage was: %.1f KwHs\n", utility.getUsage() );
            System.out.printf("Your rate was: $%.4f/KwH\n", utility.getRate());
            System.out.printf("Your subtotal is: $%.2f\n", utility.getSubtotal());
            System.out.printf("Taxes are: $%.2f\n", utility.getTaxes());
            System.out.printf("Your total bill this month is: $%.2f\n", utility.getTotal());

            System.out.print("Would you like to calculate a new usage?\n"
                    + "(Y for Yes, N for No): ");
            cont = input.next().toUpperCase().charAt(0);
            //No case
            if (cont == 'N' || cont == 'n') {
                System.out.printf("Thank you for using this program. Goodbye!");
                System.exit(0);
            }
        } while (cont == 'Y' || cont == 'y');

    } //End Main Method

} //End Class AHall_Week9

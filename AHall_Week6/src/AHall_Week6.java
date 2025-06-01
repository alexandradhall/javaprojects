
/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Feb 25, 2021
 * @Description:
 */
//Imports
import java.util.Scanner;
//Begin Class AHall_Week6

public class AHall_Week6 {

    //Begin Main Method
    public static void main(String[] args) {
        //New scanner object
        Scanner input = new Scanner(System.in);
        //New Variables
        double first;
        double second;
        double subtotal;
        double tax;
        double total;
        char cont;

        System.out.print("Welcome to the City Power Bill Calculator! ");
        do {
            System.out.print("Please enter your previous meter reading: ");
            first = input.nextDouble();
            System.out.print("Please enter your current meter reading: ");
            second = input.nextDouble();
            double current = usage(first, second);
            System.out.printf("Your usage was: %.1f KwHs\n", current );
            
            subtotal = subtotal(current);
                System.out.printf("Your subtotal is: $%.2f\n", subtotal);
            
            tax = taxes(subtotal);
            System.out.printf("Taxes are: $%.2f\n", tax);
            
            total = subtotal + tax;
            System.out.printf("Your total bill this month is: $%.2f\n", total);
            
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

    /**
     *
     * @param first
     * @param second
     * @return
     */
    private static double usage(double first, double second) {
        double current = second - first;
        return current;
    }
    /**
     * 
     * @param current
     * @return 
     */
    private static double subtotal(double current){
        double rate;
        if(current <= 500){
            rate = 0.0809 ;
        }
        else if(current >= 501 && current <=900){
            rate = 0.091;
        }
        else{
            rate = 0.109;
        }
        System.out.printf("Your rate was: $%.4f/KwH\n", rate);
        double subtotal = rate * current;
        return subtotal;
    }
    
    private static double taxes(double subtotal){
        double tax = subtotal * 0.0346;
        return tax;
    }
} //End Class AHall_Week6

package ahall_week10;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week10
 * @Date: Apr 1, 2021
 * @Description:
 */
//Imports
import java.util.Scanner;
//Begin Class AHall_Week10

public class AHall_Week10 {

    //Begin Main Method
    public static void main(String[] args) {

        //New Scanner object
        Scanner input = new Scanner(System.in);

        //Variables
        String name;
        String date;
        String card;
        String cont;
        do {
            System.out.print("Enter Card Holder's Name: ");
            name = input.nextLine();
            System.out.print("Enter Credit Card Number (No dashes): ");
            card = input.nextLine();
            System.out.print("Enter Credit Card Expiration Date (MM/YY): ");
            date = input.nextLine();

            VerifyCard verify = new VerifyCard(name, card, date);

            if (verify.getVerify()) {
                System.out.printf("\n%s's card number: %s is a valid credit"
                        + " card.\n", verify.getName(), card);
            } else {
                System.out.printf("\n%s's card number: %s is NOT a valid c"
                        + "redit card.\n", verify.getName(), card);
            }
            System.out.print("Would you like to calculate a new usage?\n"
                    + "(Y for Yes, N for No): ");
            cont = input.nextLine();
            //No case
            if (cont.equalsIgnoreCase("N")) {
                System.out.printf("Thank you for using this program. Goodbye!");
                System.exit(0);
            }
        } while (cont.equalsIgnoreCase("Y"));
    } //End Main Method

} //End Class AHall_Week10


/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: Loops
 * @Date: Feb 14, 2021
 * @Description: simple program that will determine factorial values of positive
 * integers.
 */
//Imports
import java.util.Scanner;
import java.math.BigInteger;
//Begin Class AHall_Week5

public class AHall_Week5 {

    //Begin Main Method
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        //Input variables
        int choice;
        int end;
        char cont;
        BigInteger factorial = new BigInteger("1");

        //Initial Factorial 
        System.out.println("Welcome to my factorial program! Please choose "
                + "from the following: ");
        System.out.println("1. Run Program");
        System.out.println("2. Exit Program");
        choice = input.nextInt();
        //Switch block menu
        switch (choice) {
            case 1:
                System.out.println("This program will determine the factorial "
                        + "value of positive integers.");
                do {

                    //Yes Case
                    System.out.println("The starting number is 1.");
                    System.out.print("Please enter an ending integer value: ");
                    end = input.nextInt();
                    for (int ctr = 1; ctr <= end; ctr++) {
                        factorial = factorial.multiply(BigInteger.valueOf(ctr));
                        System.out.printf("%d! = %d\n", ctr, factorial);
                    }
                    //Repeat?
                    System.out.print("Run factorial program again? "
                            + "(Y for Yes, N for No): ");
                    cont = input.next().toUpperCase().charAt(0);
                    //No case
                    if (cont == 'N' || cont == 'n') {
                        System.out.printf("Thank you for using the factorial "
                                + "program! Goodbye!.");
                        System.exit(0);
                    }
                } while (cont == 'Y' || cont == 'y');
                break;
            case 2:
                System.out.printf("Thank you for using the factorial program! "
                        + "Goodbye!.");
                System.exit(0);
                break;
        }
    } //End Main Method

} //End Class AHall_Week5

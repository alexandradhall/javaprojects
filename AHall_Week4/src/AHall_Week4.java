
/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Feb 11, 2021
 * @Description:Program that accepts a paragraph of text that can be manipulated
 */
//Imports
import java.util.Scanner;
//Begin Class AHall_Week4

public class AHall_Week4 {

    //Begin Main Method
    public static void main(String[] args) {

        //Object Creation
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Please enter a paragraph of text: ");
        String paragraph = input.nextLine();
        System.out.println("You entered: ");
        System.out.println(paragraph);

        System.out.println("Please choose from the following menu of options: ");
        System.out.println("1. Convert to all uppercase letters.");
        System.out.println("2. Convert to all lowercase letters.");
        System.out.println("3. Display the length of the paragraph.");
        System.out.println("4. Select a substring from the paragraph.");
        System.out.println("5. Let Random select a substring from the "
                + "paragraph.");
        System.out.println("6. Exit.");
        choice = input.nextInt();
        //System.out.println("Choice: " + choice);
//            Switch/case block
        switch (choice) {
            case 1:
                String upper = paragraph.toUpperCase();
                System.out.printf("Your paragraph in all uppercase letters: ");
                System.out.printf("\n%s\n", upper);
                break;
            case 2:
                System.out.printf("Your paragraph in all lowercase letters: ");
                String lower = paragraph.toLowerCase();
                System.out.printf("\n%s\n", lower);
                break;
            case 3:
                //int length = paragraph.length();
                System.out.printf("The length of your paragraph is: ");
                System.out.printf("%d characters & spaces.\n", paragraph.length());
                break;
            case 4:
                //int length = paragraph.length();
                System.out.printf("Select a starting point between 0 and %d: ", paragraph.length());
                int lwrLimit = input.nextInt();
                System.out.printf("Select a starting point between %d and %d: ", lwrLimit, paragraph.length());
                int upprLimit = input.nextInt();
                System.out.printf("%s\n", paragraph.substring(lwrLimit, upprLimit));
                break;
            case 5:
                int scndLimit = (int)(Math.random() * paragraph.length());
                int fstLimit= (int)(Math.random() * scndLimit);
                System.out.printf("%s\n", paragraph.substring(fstLimit, scndLimit));
                break;
            case 6:
                System.out.printf("Thank you for using the program.\nGoodbye.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }
    } //End Main Method

} //End Class AHall_Week4

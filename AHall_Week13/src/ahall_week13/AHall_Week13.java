package ahall_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week13
 * @Date: Apr 22, 2021
 * @Description: program that will compile a list of instruments from different
 * instrument families.
 */
//Imports
import java.util.*;
import java.io.IOException;
import java.util.InputMismatchException;
//Begin Class AHall_Week13

public class AHall_Week13 {

    static ArrayList<String> instruments = new ArrayList<>();

    static Woodwind woodwinds = new Woodwind();
    static Brass brass = new Brass();
    static Strings string = new Strings();
    static Percussion percussion = new Percussion();
    static String cont;

    //Begin Main Method
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String display;
        int choice = 0;
        int num;
        int flag = 1;

        do {

            System.out.println("Select one of the following instrument families: ");
            do {

                try {
                    System.out.print("1. Brass\n"
                            + "2. String\n"
                            + "3. Woodwind\n"
                            + "4. Percussion\n"
                            + "5. Display all instruments\n"
                            + "6. Exit\n");
                    choice = input.nextInt();

                    if (choice < 1 || choice > 6) {
                        System.out.println("Please enter one of the choices listed.");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter one of the "
                            + "numbers listed.");
                }
                input.nextLine();
            } while (choice < 1 || choice > 6);

            switch (choice) {
                case 1:
                    System.out.print("How many brass instruments "
                            + "would you like to enter?: ");
                    num = input.nextInt();

                    for (int i = 0; i < num; i++) {
                        System.out.printf("Enter instrument #%d: ", i + 1);
                        brass.setBrass(input.next());
                        instruments.add(brass.getBrass());
                    }
                    break;
                case 2:
                    System.out.print("How many string instruments would you "
                            + "like to enter?: ");
                    num = input.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.printf("Enter instrument #%d: ", i + 1);
                        string.setStrings(input.next());
                        instruments.add(string.getStrings());
                    }
                    break;
                case 3:
                    System.out.print("How many woodwind instruments would you "
                            + "like to enter?: ");
                    num = input.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.printf("Enter instrument #%d: ", i + 1);
                        woodwinds.setWoodwind(input.next());
                        instruments.add(woodwinds.getWoodwind());
                    }
                    break;
                case 4:
                    System.out.print("How many percussion instruments would you "
                            + "like to enter?: ");
                    num = input.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.printf("Enter instrument #%d: ", i + 1);
                        percussion.setPercussion(input.next());
                        instruments.add(percussion.getPercussion());
                    }
                    break;
                case 5:
                    displayArray(instruments);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option.");
                    System.exit(1);
                    break;
            }

            while (flag != 0) {
                System.out.print("Display instruments?\n"
                        + "(Y for Yes, N for No): ");
                display = input.next();
                if (display.equalsIgnoreCase("Y")) {
                    displayArray(instruments);
                    flag = 0;
                } else if (display.equalsIgnoreCase("N")) {
                    flag = 0;
                    break;
                } else {
                    System.out.print("Invalid input. Try again.");
                    flag = 1;
                }
            }

            flag = 1;
            while (flag != 0) {
                System.out.print("Enter more instruments?\n"
                        + "(Y for Yes, N for No): ");
                cont = input.next();
                //No case
                if (cont.equalsIgnoreCase("N")) {
                    System.out.printf("Thank you for using this program. Goodbye!");
                    System.exit(0);
                } else if (cont.equalsIgnoreCase("Y")) {
                    flag = 0;
                    break;
                } else {
                    System.out.print("Invalid input. Try again.");
                    flag = 1;
                }
            }
            
            flag = 1;
        } while (cont.equalsIgnoreCase("Y"));

    } //End Main Method

    /**
     * Method displayArray: displays array
     * @param instruments 
     */
    private static void displayArray(ArrayList<String> instruments) {
        for (int i = 0; i < instruments.size(); i++) {
            System.out.println(instruments.get(i));
        }
    }

} //End Class AHall_Week13

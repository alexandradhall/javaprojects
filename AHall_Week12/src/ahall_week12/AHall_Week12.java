package ahall_week12;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week12
 * @Date: Apr 17, 2021
 * @Description:
 */
//Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
//Begin Class AHall_Week12
public class AHall_Week12 {

    //Static scanner variable

    static Scanner input = new Scanner(System.in);

    //Subclass
    static ReadData readData = new ReadData();
    static WriteData writeData = new WriteData();
    static CheckError checkErr = new CheckError();

    // Class variables
    // variable for file
    static String ans;
    static final File FILE_DIR = new File(
            "C:/W12Assignment");
    static File file = new File(
            "C:/W12Assignment/MyNumbers.txt");
    static ArrayList<Double> nums = new ArrayList<Double>();
    static boolean exit = false; 
    //Begin Main Method

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Variables
        int menuChoice = 0;
        int exitNum = 1;
        int lowRange = 1;
        int upRange = 3;


        System.out.println("Welcome to My Statistics Calculator");
        enterFileName();

        do {

            do {

                System.out.println("Please select from the following menu of options:");

                System.out.print("1. Enter Data\n" + "2. Read Data\n" 
                        + "3. Exit\n" + "->: ");
                try {

                    do {
                        menuChoice = input.nextInt();
                        checkErr.setRange(menuChoice, lowRange, upRange);
                        System.out.println(); 

                    } while (!checkErr.getRange());
                } catch (InputMismatchException IME) {

                    System.err.println("Exception. You must enter a number. P"
                            + "lease try again.");
                    input.nextLine(); // Clears the buffer
                }
            } while (!checkErr.getRange());
            switch (menuChoice) {

                case 1:
                    writeData();

                    System.out.print("Would you like to read the see the results? ->: ");
                    do {

                        ans = input.next();
                        if (ans.equalsIgnoreCase("Y")) {
                            readData();
                        } else if (ans.equalsIgnoreCase("N")) {
                            break;
                        }
                        checkErr.setYesNo(ans);
                    } while (!checkErr.getYesNo()); 

                    break;
                case 2:
                    readData();

                    break;
                case 3:
                    Exit(exitNum);

                    break;
                default:
                    exitNum = 2;
                    Exit(exitNum);
                    break;
            }

            do { 

                System.out.print("Would you like to run the program again? ->: ");
                ans = input.next();
                if (ans.equalsIgnoreCase("Y")) {
                    exit = false;
                } else {
                    exit = true;
                }
                checkErr.setYesNo(ans,
                        exit);
               
            } while (!checkErr.getYesNo()); // End inner loop

        } while (ans.equalsIgnoreCase("Y"));

    } // End Main Method

    public static void readData() throws FileNotFoundException {
        if (file.length() != 0) { 
            readData.setData(FILE_DIR, file);

            try (Scanner input = new Scanner(file)) {

                System.out.println("The numbers in this file are:");
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    System.out.println(line);
                }
            }
            System.out.printf("The average of the numbers in file name is: "
                    + "%.4f\n", readData.getAvg());
            System.out.printf("The smallest number in the file is: "
                    + "%.4f\n", readData.getMin());
            System.out.printf("The largest number in the file is:"
                    + " %.4f\n", readData.getMax());
            System.out.printf("The standard deviation for the numbers in this "
                    + "file is: %.4f\n", readData.getStdDev());
        } else {

            System.out.print("The file contains no data.\nEnter data? ->: ");

            do {
                ans = input.next();
                if (ans.equalsIgnoreCase("Y")) {
                    writeData();
                    System.out.print("Would you like to read the see the results? ->: ");
                    do {
                        ans = input.next();
                        if (ans.equalsIgnoreCase("Y")) {
                            readData();
                        } else if (ans.equalsIgnoreCase("N")) {
                            break;
                        }
                        checkErr.setYesNo(ans);
                    } while (!checkErr.getYesNo()); 

                } else if (ans.equalsIgnoreCase("N")) {

                    break;

                }

                checkErr.setYesNo(ans);

            } while (!checkErr.getYesNo());
        }
    }
    public static void Exit(int num) {
        if (num == 1) {
            System.exit(0);

        } else {
            System.exit(1);
        }

    }
    private static void writeData() throws FileNotFoundException {
        int high;
        double num;
        boolean flag = false;
        boolean iFlag;
        do {
            System.out.print("How many numbers would you like to send to the file? ->: ");
            try { 
                high = input.nextInt();
                do { 
                    for (int i = 1; i <= high; i++) {
                        try {
                            System.out.printf("Enter number %d -> ", i);
                            num = input.nextDouble();
                            nums.add(num);
                        } catch (InputMismatchException IME) { 
                            iFlag = false;
                            input.nextLine();
                            i -= 1; 
                            System.err.println("Entry Error: Please enter a number.");
                        }
                    }

                    iFlag = true; 
                } while (!iFlag);
                writeData.setData(FILE_DIR, file, nums, nums.size());
                flag = true; 
            } catch (InputMismatchException IME) {
                input.nextLine();
                System.err.println("Entry Error: Please enter a number.");
            }
        } while (!flag); 
    }
    private static void enterFileName() throws IOException {

        String fileName = "";

        System.out.print("Enter the name of your text file (e.g. MyNumbers)\n"
                + "The file extension will be added after entry.\n->: ");

        fileName = input.next();
        String fileNameWithExt = fileName.concat(".txt");
        File file_Name = new File(FILE_DIR + "/" + fileNameWithExt);

        if (!FILE_DIR.exists()) {

            FILE_DIR.mkdirs();

            System.out.printf("\nThe directory does not exist.\nCreating "
                    + "directory..."
                    + "\nDirectory created at this location ->: " 
                    + "%s\n\n", FILE_DIR.getAbsolutePath());
        } else {
            System.out.printf("\nThe directory exists at this location ->: " 
                    + "%s\n\n", FILE_DIR.getAbsolutePath());
        }
        file = file_Name;
        if (!file.exists()) {
            System.out.println("The file does not exist.\nCreating file...");
            file.createNewFile();
            System.out.printf("\nFile created at this location ->: " 
                    + "%s\n\n", file.getAbsolutePath());
        } else {
            System.out.printf("The file exists at this location ->: " 
                    + "%s\n\n", file.getAbsolutePath());
        }

    } //End Main Method

} //End Class AHall_Week12

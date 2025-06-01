
/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Mar 20, 2021
 * @Description:
 */
//Imports
import java.util.Scanner;

//Begin Class AHall_Week8
public class AHall_Week8 {

    //Begin Main Method
    public static void main(String[] args) {
        //New Scanner object
        Scanner input = new Scanner(System.in);

        //New variables
        int rows;
        int m;
        int n;
        char cont;

        //
        System.out.println("Welcome! This program that accepts an n x n"
                + " matrix, totals the rows and columns & finds the product "
                + "of each row and column.\n");
        
        //Loop
        do {
            //user input
            System.out.print("Enter number of rows & columns "
                    + "(they will be the same): ");
            rows = input.nextInt();
            int array[][] = new int[rows][rows];

            //array inputs
            //loop for row  
            m = rows;
            n = rows;
            for (int i = 0; i < m; i++) {
                //inner for loop for column
                for (int j = 0; j < n; j++) {
                    //user input
                    System.out.print("Enter a value for Row " + (i + 1) + 
                            ", Column " + (j + 1) + ": ");
                    array[i][j] = input.nextInt();
                }
            }

            displayArray(array);
            rowTotals(array);
            colTotals(array);
            rowProducts(array);
            colProducts(array);
            max(array);
            least(array);
            System.out.print("Enter another matrix? (Y or N): ");
            cont = input.next().toUpperCase().charAt(0);
            //No case
            if (cont == 'N' || cont == 'n') {
                System.out.printf("Thank you. Goodbye!");
                System.exit(0);
            }
        } while (cont == 'Y' || cont == 'y');

    } //End Main Method

    /**
     * Method displayArray
     *
     * @param array
     */
    private static void displayArray(int array[][]) {

        System.out.println("The Matrix****************************************");
        //testing different ways to access length
        for (int i = 0; i < array.length; i++) {
            //inner for loop for column
            for (int j = 0; j < array.length; j++) {
                System.out.print("\t" + array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    /**
     * Method rowTotals : sum of rows
     *
     * @param array
     */
    private static void rowTotals(int array[][]) {
        System.out.println("Row Totals****************************************");
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + " is: " + sum);
        }
    }

    /**
     * Method colTotals: Sums columns
     *
     * @param array
     */
    private static void colTotals(int array[][]) {
        System.out.println("Column Totals****************************************");
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[j][i];
            }
            System.out.println("The sum of column " + (i + 1) + " is: " + sum);
        }
    }

    /**
     * Method rowProducts: Finds product of rows
     *
     * @param array
     */
    private static void rowProducts(int array[][]) {
        System.out.println("Row Products****************************************");
        int prod;
        for (int i = 0; i < array.length; i++) {
            prod = 1;
            for (int j = 0; j < array.length; j++) {
                prod = prod * array[i][j];
            }
            System.out.println("The product of row " + (i + 1) + " is: " + prod);
        }
    }

    /**
     * Method colProducts: Finds product of columns
     *
     * @param array
     */
    private static void colProducts(int array[][]) {
        System.out.println("Row Products****************************************");
        int prod;
        for (int i = 0; i < array.length; i++) {
            prod = 1;
            for (int j = 0; j < array.length; j++) {
                prod = prod * array[j][i];
            }
            System.out.println("The product of column " + (i + 1) + " is: " + prod);
        }
    }

    /**
     * Method max: Finds highest value in array
     *
     * @param array
     */
    private static void max(int array[][]) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            //inner for loop for column
            for (int j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The greatest value in this matrix is: " + max);
    }

    /**
     * Method least: Finds lowest value in array
     * @param array 
     */
    private static void least(int array[][]) {
        int least = array[0][0];

        for (int i = 0; i < array.length; i++) {
            //inner for loop for column
            for (int j = 0; j < array.length; j++) {
                if (least > array[i][j]) {
                    least = array[i][j];
                }
            }
        }
        System.out.println("The lowest value in this matrix is: " + least);
    }
} //End Class AHall_Week8


/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Mar 4, 2021
 * @Description: Write a program that accepts a number of grades, prints each
 * grade’s letter grade, the high and low grades and the average of the number
 * of grades entered.
 */
//Imports
import java.util.Scanner;

//Begin Class AHall_Week7
public class AHall_Week7 {

    //Begin Main Method
    public static void main(String[] args) {
        //New Scanner object
        Scanner input = new Scanner(System.in);

        //Variables
        int num;
        char cont;

        do {
            //Number of grades
            System.out.print("Please enter a number of grades between 1 and 99: ");
            num = input.nextInt();
            if (num > 99 || num < 1) {
                System.out.println("Error: Number must be between 1 and 99.");
                System.exit(1);
            }
            double[] grades = new double[num];
            random(grades);
            lettrGrd(grades);
            System.out.printf("The lowest grade was: %.2f\n", lowest(grades));
            System.out.printf("The highest grade was: %.2f\n",
                    highest(grades));
            System.out.printf("The average is: %.2f\n", average(grades));
            System.out.print("Run program again?(Y for Yes, N for No): ");
            cont = input.next().toUpperCase().charAt(0);
            //No case
            if (cont == 'N' || cont == 'n') {
                System.out.printf("Thank you. Goodbye!");
                System.exit(0);
            }
        } while (cont == 'Y' || cont == 'y');
    } //End Main Method

    /**
     * Method random: randomly selects grades (of type double) between 55 and
     * 100 and places them into the array
     *
     * @param grades
     * @return
     */
    private static double[] random(double[] grades) {
        //Random 55-99;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 55 + (double) (Math.random() * 45);
        }

        return grades;
    }

    /**
     * Method: lettrGrd:
     *
     * @param grades
     */
    private static void lettrGrd(double[] grades) {
        System.out.println("The letter grades for each score are: ");
        for (int i = 0; i < grades.length; i++) {
            String letter;
            if (grades[i] >= 92.50) {
                letter = "A";
            } else if (grades[i] >= 89.50 && grades[i] < 92.50) {
                letter = "A-";
            } else if (grades[i] >= 86.50 && grades[i] < 89.50) {
                letter = "B+";
            } else if (grades[i] >= 82.50 && grades[i] < 86.50) {
                letter = "B";
            } else if (grades[i] >= 79.50 && grades[i] < 82.50) {
                letter = "B-";
            } else if (grades[i] >= 76.50 && grades[i] < 79.50) {
                letter = "C+";
            } else if (grades[i] >= 72.50 && grades[i] < 76.50) {
                letter = "C";
            } else if (grades[i] >= 69.50 && grades[i] < 72.50) {
                letter = "C-";
            } else if (grades[i] >= 66.50 && grades[i] < 69.50) {
                letter = "D+";
            } else if (grades[i] >= 62.50 && grades[i] < 66.50) {
                letter = "D";
            } else if (grades[i] >= 59.50 && grades[i] < 62.50) {
                letter = "D-";
            } else {
                letter = "F";
            }
            System.out.printf("Grade " + (i + 1) + ":  %.2f is a %s \n",
                    grades[i], letter);
        }
    }

    /**
     * Method lowest: output the lowest grade from the array
     *
     * @param grades
     * @return
     */
    private static double lowest(double[] grades) {

        double min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        return min;
    }

    /**
     * Method highest: output the highest grade from the array
     *
     * @param grades
     * @return
     */
    private static double highest(double[] grades) {

        double max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        return max;
    }

    /**
     * Method average: output the average of the grades in the array
     *
     * @param grades
     * @return
     */
    private static double average(double[] grades) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < grades.length; i++) {

            sum += grades[i];
        }
        avg = sum / grades.length;
        return avg;
    }

} //End Class AHall_Week7

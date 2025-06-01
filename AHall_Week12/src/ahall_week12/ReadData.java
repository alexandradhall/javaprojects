package ahall_week12;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week12
 * @Date: Apr 17, 2021
 * @Subclass ReadData Description: Reads data from file and performs calculations
 */
//Imports
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Collections;
import static java.lang.Math.*;
//Begin Subclass ReadData
public class ReadData {

    // Instance variables
    private File fFile;
    private File fDir;
    private double avg = 0; 
    ArrayList<Double> nums = new ArrayList<Double>(); 
    ArrayList<Double> sdNums = new ArrayList<Double>(); 
    private double max; 
    private double min; 
    private double avg_copy = 0; 
    private double avgSqrdDiff = 0; 
    private double stdDev = 0; 

    /**
     *
     * Method setData: Method to read numbers from the file and place them into
     * an ArrayList. The list is then sent to the other set methods
     *
     * @param fileDir
     * @param file
     *
     * @throws FileNotFoundException
     *
     */
    public void setData(File FILE_DIR, File file) throws FileNotFoundException {

        fFile = file;
        fDir = FILE_DIR;
        nums.clear();
        try (Scanner input = new Scanner(fFile)) {
            while (input.hasNextLine()) {
                nums.add(input.nextDouble());
            }
        }
        setAvg(nums);
        setMinMax(nums);
        setStdDev(nums);
    }

    /**
     *
     * Method setAvg: Used to calculate the average of the numbers in the file
     * 
     * @param nums
     */
    private void setAvg(ArrayList<Double> nums) {

        avg = 0;
        for (int i = 0; i < nums.size(); i++) {
            avg += nums.get(i);
        }
        avg /= nums.size();
    }
    /**
     * Method setMinMax: Determine min and max values of data in file
     * 
     * @param nums
     *
     */
    private void setMinMax(ArrayList<Double> nums) {
        max = Collections.max(nums); 
        min = Collections.min(nums); 
    }

    /**
     *
     * Method setStdDev: Used to determine the StdDev for the file data
     * 
     * @param nums
     * 
     */
    private void setStdDev(ArrayList<Double> nums) {

        avg_copy = 0;
        avgSqrdDiff = 0;
        stdDev = 0;
        sdNums.clear();
        avg_copy = getAvg();

        for (double i : nums) {
            i -= avg_copy;
            sdNums.add(pow(i, 2));
        }
        for (double x : sdNums) {

            avgSqrdDiff += x;
        }
        avgSqrdDiff /= sdNums.size();
        stdDev = sqrt(avgSqrdDiff);
    }

    /**
     *
     * Method getAvg: Return the calculated average
     *
     * @return avg
     *
     */
    public double getAvg() {
        return avg;
    }

    /**
     *
     * Method getMax: Return max value
     *
     * @return max
     *
     */
    public double getMax() {
        return max;
    }

    /**
     *
     * Method getMin: Return min value
     *
     * @return min
     *
     */
    public double getMin() {
        return min;
    }

    /**
     *
     * Method getStdDev: return calculated StdDev
     *
     * @return stdDev
     *
     */
    public double getStdDev() {
        return stdDev;
    }  
} //End Subclass ReadData

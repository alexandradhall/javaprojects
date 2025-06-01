package ahall_week12;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week12
 * @Date: Apr 17, 2021
 * @Subclass WriteData Description: Writes data to file
 */
//Imports
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//Begin Subclass WriteData
public class WriteData {
    // Instance variables

    private File fFile; // variable for file

    private File fDir; // variable for file directory

    /**
     * Method SetData: Used to write data passed in the form of an ArrayList
     * into a data file.
     *
     *
     * @param fileDir
     * @param file
     * @param nums
     * @param max
     * @throws FileNotFoundException
     */
    public void setData(File FILE_DIR, File file, ArrayList<Double> nums, int max) throws FileNotFoundException {

        fFile = file;
        fDir = FILE_DIR;
        int flag = 1; 
        try (PrintWriter output = new PrintWriter(fFile)) {
            for (double i : nums) {
                if (flag < max) {
                    output.printf("%.4f" + System.getProperty("line.separator"), i);
                    flag += 1;
                } else {
                    output.printf("%.4f", i);
                }
            }
            output.close();
        }

    }

} //End Subclass WriteData


/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: 
 * @Date: Feb 23, 2021
 * @Description: 
 */
//Imports

//Begin Class Midweek7
public class Midweek7 {

    //Begin Main Method
    public static void main(String[] args) {

        printMax(1, 2, 2, 1, 4);
        printMax(new double[]{1, 2, 3, 78});
        printMax(new double[]{2, 5, 9, 23});
    } //End Main Method
    
     public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("This is an empty set.");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.printf("Max is: %f\n", result);
    }//End printMax method

} //End Class Midweek7
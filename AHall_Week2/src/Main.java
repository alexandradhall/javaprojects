
/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: 
 * @Date: Jan 28, 2021
 * @Description: 
 */
//Imports
import java.lang.Math;
import java.util.Scanner;
//Begin Class Main
public class Main {
        //Static
        static final double ACRE = 43560;
    //Begin Main Method
    public static void main(String[] args) {
        //Scanner object
        Scanner number = new Scanner(System.in);
        //user input
        System.out.print("Please enter Side A in feet: ");
        double sideA = number.nextDouble();
        
        System.out.print("Please enter Side B in feet: ");
        double sideB = number.nextDouble();
         
        //side C
        double sideC = Math.sqrt((Math.pow(sideA,2) + Math.pow(sideB,2)));
        System.out.println("Side C is equal " + sideC + " feet.");
        //Area in acres
        double area = (sideA * sideB)/2;
        double acreage = area / ACRE;
        System.out.println("The total acreage is: " + acreage + " acres.");
    } //End Main Method

} //End Class Main
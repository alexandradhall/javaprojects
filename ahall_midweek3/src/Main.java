
/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: 
 * @Date: Jan 26, 2021
 * @Description: 
 */
//Imports
import java.util.Scanner;
//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Select a number for the year: ");
int year = sc.nextInt();

switch (year) {
    case 1:
        System.out.println("Year of the Pig.");
        break;
    case 2:
        System.out.println("Year of the Rat.");
    case 3:
        System.out.println("Year of the Ox.");
    case 4:
        System.out.println("Year of the Tiger.");
    case 5:
        System.out.println("Year of the Hare.");
}
    } //End Main Method

} //End Class Main

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Feb 2, 2021
 * @Description:
 */
//Imports\
import java.util.Scanner;
//Begin Class main
public class main {

    //Begin Main Method
    public static void main(String[] args) {
        //Begin Main Method

        int age = 0;
        String fName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        fName = sc.next();
        System.out.print("Please enter your age: ");
        age = sc.nextInt();
        System.out.printf("Hello %s\nYou don't look like you're %d years old!\n"
                , fName, age);
    } //End Main Method
} //End Main Method


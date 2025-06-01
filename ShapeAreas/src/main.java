
/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name:
 * @Date: Feb 4, 2021
 * @Description: program to determine the area of some geometric shapes.
 */
//Imports
import java.util.Scanner;

//Begin Class main
public class main {

    //Begin Main Method
    public static void main(String[] args) {

        //and user input
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            //Menu
            System.out.println("Please select an area to determine from the "
                    + "following menu choices");
            System.out.println("1. Determine the area of a Square.");
            System.out.println("2. Determine the area of a Circle.");
            System.out.println("3. Determine the area of a Ellpse.");
            System.out.println("4. Determine the area of a Pentagon.");
            System.out.println("5. Exit.");
            choice = input.nextInt();
            System.out.println("Choice: " + choice);
            //Switch/case block
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the length of one side: ");
//                    int side = input.nextInt();
//                    double sqArea = Math.pow(side, 2);
//                    System.out.println("The formula of the area of a square is:"
//                            + " "
//                            + "side^2");
//                    System.out.println("The area of a square with a side of "
//                            + side + " is " + sqArea);
//                    break;
//                case 2:
//                    System.out.print("Enter the radius of the circle: ");
//                    int radius = input.nextInt();
//                    double cirArea = (Math.pow(radius, 2)) * Math.PI;
//                    System.out.println("The formula of the area of a circle is:"
//                            + " PI * r^2");
//                    System.out.println("The area of a circle with a radius of "
//                            + radius + " is " + cirArea);
//                    break;
//                case 3:
//                    System.out.print("Enter the radius1 of the ellipse: ");
//                    int radius1 = input.nextInt();
//                    System.out.print("Enter the radius2 of the ellipse: ");
//                    int radius2 = input.nextInt();
//                    double ellArea = radius1 * radius2 * Math.PI;
//                    System.out.println("The formula of the area of an ellipse"
//                            + " is: PI * Radius1 * Radius2");
//                    System.out.println("The area of an ellipse with a radius of "
//                            + radius1 + " and " + radius2 + " is " + ellArea);
//                    break;
//                case 4:
//                    System.out.print("Enter the length of one side: ");
//                    int pentSide = input.nextInt();
//                    double pentArea = (Math.sqrt(5 * (5 + (2 * Math.sqrt(5))))
//                            * Math.pow(pentSide, 2)) / 4;
//                    System.out.println("The formula of the area of a pentagon "
//                            + "is: 1/4 * sqrt(5*(5+2*sqrt(5)))* side^2");
//                    System.out.println("The area of a pentagon with a side of "
//                            + pentSide + " is " + pentArea);
//                    break;
//                case 5:
//                    System.out.println("Exiting now.");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    System.exit(1);
//                    break;
//            }
//        //if-else-if
        if (choice == 1) {
            System.out.print("Enter the length of the side: ");
            int side = input.nextInt();
            double area = Math.pow(side, 2);
            System.out.println("The formula of the area of a square is: "
                    + "side^2");
            System.out.println("The area of a square with a side of "
                    + side + " is " + area);
        } else if (choice == 2) {
            System.out.print("Enter the radius of the circle: ");
            int radius = input.nextInt();
            double cirArea = (Math.pow(radius, 2)) * Math.PI;
            System.out.println("The formula of the area of a circle is:"
                    + " PI * r^2");
            System.out.println("The area of a circle with a radius of "
                    + radius + " is " + cirArea);
        } else if (choice == 3) {
            System.out.print("Enter the radius1 of the ellipse: ");
            int radius1 = input.nextInt();
            System.out.println("Enter the radius2 of the ellipse: ");
            int radius2 = input.nextInt();
            double ellArea = radius1 * radius2 * Math.PI;
            System.out.println("The formula of the area of an ellipse"
                    + " is: PI * Radius1 * Radius2");
            System.out.println("The area of an ellipse with a radius of "
                    + radius1 + " and " + radius2 + " is " + ellArea);
        } else if (choice == 4) {
            System.out.print("Enter the length of one side: ");
            int pentSide = input.nextInt();
            double pentArea = (Math.sqrt(5 * (5 + (2 * Math.sqrt(5))))
                    * Math.pow(pentSide, 2)) / 4;
            System.out.println("The formula of the area of a pentagon "
                    + "is: 1/4 * sqrt(5*(5+2*sqrt(5)))* side^2");
            System.out.println("The area of a pentagon with a side of "
                    + pentSide + " is " + pentArea);
        } else if (choice == 5) {
           System.out.println("Exiting now.");
           System.exit(0);
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }


        } while (choice != 5);

    } //End Main Method

} //End Class main

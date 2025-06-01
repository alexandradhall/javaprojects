package ahall_week11;

import java.util.Scanner;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week11
 * @Date: Apr 10, 2021
 * @Description:
 */
//Imports
//Begin Class AHall_Week11
public class AHall_Week11 {

    //Begin Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char cont;
        char idea;
        int count;

        do {
            System.out.println("Welcome to the Student Grade Calculator");
            String firstName, lastName;
            System.out.print("Enter Student's First Name: ");
            firstName = input.next();
            System.out.print("Enter Student's Last Name: ");
            lastName = input.next();

            Student student;
            System.out.printf("\nEnter number of student type %s %s:\n"
                    + "1.Undergraduate Student\n"
                    + "2.Graduate Student\n", firstName, lastName);
            int gradeType = input.nextInt();

            if (gradeType == 1) {
                student = new UnderGrad(firstName, lastName);
            } else {
                student = new Grad(firstName, lastName);
            }

            int currentIndex = 1;
            System.out.println("Enter the number of Assignment grades: ");

            count = input.nextInt();
            while (currentIndex <= count) {
                System.out.println("Enter Assignment grade number " + currentIndex + ":");
                if (gradeType == 1) {
                    ((UnderGrad) student).addAssignments(input.nextFloat());
                } else {
                    ((Grad) student).addAssignments(input.nextFloat());
                }
                currentIndex++;
            }

            count = 0;
            currentIndex = 1;

            System.out.println("Enter the number of Discussion grades: ");

            count = input.nextInt();
            while (currentIndex <= count) {
                System.out.println("Enter Discussion grade number "
                        + currentIndex + ":");
                if (gradeType == 1) {
                    ((UnderGrad) student).addDiscussions(input.nextFloat());
                } else {
                    ((Grad) student).addDiscussions(input.nextFloat());
                }
                currentIndex++;
            }

            count = 0;
            currentIndex = 1;

            System.out.println("Enter the number of Midweek Assignment grades: ");

            count = input.nextInt();
            while (currentIndex <= count) {
                System.out.println("Enter Midweek Assignment grade number "
                        + currentIndex + ":");
                if (gradeType == 1) {
                    ((UnderGrad) student).addmidweekAssignments(input.nextFloat());
                } else {
                    ((Grad) student).addmidweekAssignments(input.nextFloat());
                }
                currentIndex++;
            }

            if (gradeType != 1) {
                count = 0;
                currentIndex = 1;

                System.out.println("Enter the number of Final Thesis grades: ");

                count = input.nextInt();
                while (currentIndex <= count) {
                    System.out.println("Enter Final Thesis grade number "
                            + currentIndex + " : ");

                    ((Grad) student).addFinalThesis(input.nextFloat());
                    currentIndex++;
                }
            }

            double grade = 0;
            if (gradeType == 1) {
                grade = ((UnderGrad) student).calculateGrade();
            } else {
                grade = ((Grad) student).calculateGrade();
            }

            //IDEA 
            System.out.printf("Did %s %s fill out the IDEA Survey? "
                    + "(Y for Yes, N for No): ", firstName, lastName);
            idea = input.next().toUpperCase().charAt(0);
            if (idea == 'Y') {
                grade += 1;
            }

            System.out.printf("%s %s'sfinal grade average is: "
                    + "%.2f", firstName, lastName, grade);

            System.out.println("\nWould you like to calculate a another calculation?\n"
                    + "(Y for Yes, N for No): ");
            cont = input.next().toUpperCase().charAt(0);
            //No case
            if (cont == 'N' || cont == 'n') {
                System.out.printf("Thank you for using this program. Goodbye!");
                System.exit(0);
            }
        } while (cont == 'Y' || cont == 'y');
    } //End Main Method

} //End Class AHall_Week11

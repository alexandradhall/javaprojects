package ahall_week11;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week11
 * @Date: Apr 10, 2021
 * @Subclass Student Description:
 */
//Imports
//Begin Subclass Student
public class Student {

    String firstName, lastName;

    /**
     * Method Student: Constructor
     *
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Method setFirstName: sets first name string
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method getFirstName: retrieve first name
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method setLastName: set last name string
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method getLastName: retrieve last name string
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }
} //End Subclass Student

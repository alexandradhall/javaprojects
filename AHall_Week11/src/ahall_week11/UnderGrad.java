package ahall_week11;

import java.util.ArrayList;
import java.util.List;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week11
 * @Date: Apr 10, 2021
 * @Subclass UnderGrad Description:
 */
//Imports
import java.util.ArrayList;
import java.util.List;
//Begin Subclass UnderGrad
public class UnderGrad extends Student{

    List<Float> assignments;
    List<Float> discussions;
    List<Float> midweekAssignments;

    /**
     * Method UnderGrad: Constructor
     *
     * @param firstName
     * @param lastName
     */
    public UnderGrad(String firstName, String lastName) {
        super(firstName, lastName);

        assignments = new ArrayList<>();
        discussions = new ArrayList<>();
        midweekAssignments = new ArrayList<>();
    }

    /**
     * Method getAssignments: Retrieve assignments
     *
     * @return
     */
    public List<Float> getAssignments() {
        return assignments;
    }

    /**
     * Method addAssignments: Make array of assignments
     *
     * @param assignments
     */
    public void addAssignments(float assignments) {
        this.assignments.add(assignments);
    }

    /**
     * Method addDiscussions: Make array off discussions
     *
     * @param discussions
     */
    public void addDiscussions(float discussions) {
        this.discussions.add(discussions);
    }

    /**
     * Method addmidweekAssignments: Make array off midweek assignments
     *
     * @param midweekAssignments
     */
    public void addmidweekAssignments(float midweekAssignments) {
        this.midweekAssignments.add(midweekAssignments);
    }

    /**
     * Method getDiscussions: retrieves array of discussion grades
     *
     * @return
     */
    public List<Float> getDiscussions() {
        return discussions;
    }

    /**
     * Method getMidweekAssignments: Retrieve array of midweek assignments
     *
     * @return
     */
    public List<Float> getMidweekAssignments() {
        return midweekAssignments;
    }

    /**
     * Method calculateGrade: Calculate assignments grades
     *
     * @return
     */
    public double calculateGrade() {
        double grade = 0;
        float assignment = 0;
        for (int i = 0; i < assignments.size(); i++) {
            assignment += assignments.get(i);
        }
        float discussion = 0;
        for (int i = 0; i < discussions.size(); i++) {
            discussion += discussions.get(i);
        }
        float midweekAssignment = 0;
        for (int i = 0; i < midweekAssignments.size(); i++) {
            midweekAssignment += midweekAssignments.get(i);
        }
        grade += ((assignment / assignments.size()) * 65) / 100;
        grade += ((discussion / discussions.size()) * 25) / 100;
        grade += ((midweekAssignment / midweekAssignments.size()) * 10) / 100;

        return grade;
    }
} //End Subclass UnderGrad

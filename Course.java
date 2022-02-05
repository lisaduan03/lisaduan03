package sol;

public class Course {
    String department;
    int courseNumber;
    double credits;

    /**
     * constructor for Course with three parameters and error-checking to check
     * whether the entered value is 0.5, 1, or 1.5. If not,
     * throw an IllegalArgumentException error
     */
    public Course(String dep, int courseNum, double cred) {
        this.department = dep;
        this.courseNumber = courseNum;
        if (cred == 0.5 || cred == 1 || cred == 1.5) {
            this.credits = cred;
        } else {
            throw new IllegalArgumentException("Invalid credits");
        }
    }
    /**
     * another constructor for Course that only takes the department
     * and course number as inputs, setting credits to 1 by default
     */
    public Course(String dep, int courseNum) {
        this.department = dep;
        this.courseNumber = courseNum;
        this.credits = 1;

    }
    /**
     * javadoc not necessary-- returns a string combining department and course number
     */
    @Override
    public String toString() {
        return this.department + this.courseNumber;
    }
}

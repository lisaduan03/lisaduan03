package sol;

public class Student extends Person {
    String name;
    Course course1;
    Course course2;

    public Student(String n, Course c1, Course c2) {
        this.name = n;
        if (c1 == c2) {
            throw new IllegalArgumentException("Invalid courses");
        } else {
            this.course1 = c1;
            this.course2 = c2;
        }
    }

    /**
     * indicates whether given course is one of the two courses the student is
     * taking
     *
     * @param c given Course
     * @return true if the student is taking this course
     */
    public boolean isTaking(Course c) {
        return (this.course1 == c || this.course2 == c);
    }

    /**
     * returns the sum of credits for student's two courses
     *
     * @return a boolean representing the sum of the credits for the student's
     * two courses
     */
    public double totalCredits() {
        return (this.course1.credits + this.course2.credits);
    }
}

package sol;

public class Faculty extends Person {
    String department;
    Course teaching;

    /**
     * constructor for Faculty with three parameters
     */
    public Faculty(String n, String dep, Course teach) {
        this.name = n;
        this.department = dep;
        this.teaching = teach;
    }

    /**
     * indicates whether the faculty is teaching given course
     *
     * @param c a given Course
     * @return true if the faculty member is teaching that course
     */
    public boolean isTeaching(Course c) {
        return (this.teaching == c);
    }

    /**
     * determines whether faculty member is allowed to give a grade to that student
     *
     *
     * @param s a given Student s
     * @return true if faculty member is allowed to give a grade to that
     * student, in other words, if student is in the faculty's course
     */
    public boolean canGrade(Student s) {
        return (s.course1 == teaching || s.course2 == teaching);
    }

    public String viewGrade(GradeReport graRep) {
        if (this.teaching != graRep.forCourse) {
            throw new RuntimeException("Access denied");
        } else {
            return graRep.toString();
        }
    }
}

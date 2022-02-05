package sol;

public class TA extends Student {
    Course assisting;

    public TA(String name, Course c1, Course c2, Course assist) {
        super(name, c1, c2);
        if (assist == c1 || assist == c2) {
            throw new IllegalArgumentException("Cannot take and assist the same course");
        } else {
            this.assisting = assist;
        }
    }

    public String viewGrade(GradeReport graRep) {
        if (this.assisting != graRep.forCourse) {
            throw new RuntimeException("Access denied");
        } else {
            return graRep.toString();
        }
    }
}

package sol;

public class GradeReport {
    Student forStudent;
    Course forCourse;
    IGrade grade;

    public GradeReport(Student forStud, Course forCour, IGrade gra) {
        this.forStudent = forStud;
        this.forCourse = forCour;
        this.grade = gra;
    }
}

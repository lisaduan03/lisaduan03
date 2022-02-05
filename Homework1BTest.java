package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Homework1BTest {

    @Test
    public void isPassingTest() {
        LetterGrade A = new LetterGrade(sol.Letter.A);
        LetterGrade B = new LetterGrade(sol.Letter.C);
        LetterGrade C = new LetterGrade(sol.Letter.C);
        LetterGrade NCLetter = new LetterGrade(sol.Letter.NC);
        Assert.assertEquals(A.isPassing(), true);
        Assert.assertEquals(B.isPassing(), true);
        Assert.assertEquals(C.isPassing(), true);
        Assert.assertEquals(NCLetter.isPassing(), false);
        SNCGrade SDIST = new SNCGrade(sol.SNC.SDIST);
        SNCGrade S = new SNCGrade(sol.SNC.S);
        SNCGrade NCSNC = new SNCGrade(sol.SNC.NC);
        Assert.assertEquals(SDIST.isPassing(), true);
        Assert.assertEquals(S.isPassing(), true);
        Assert.assertEquals(NCSNC.isPassing(), false);
    }

    @Test
    public void toStringTest() {
        IGrade letterGradeA = new LetterGrade(sol.Letter.A);
        IGrade letterGradeNC = new LetterGrade(sol.Letter.NC);
        IGrade SNCGradeS = new SNCGrade(sol.SNC.S);
        IGrade SNCGradeNC = new SNCGrade(sol.SNC.NC);
        Assert.assertEquals("A", letterGradeA.toString());
        Assert.assertEquals("NC", letterGradeNC.toString());
        Assert.assertEquals("S", SNCGradeS.toString());
        Assert.assertEquals("NC", SNCGradeNC.toString());
    }

    @Test
    public void viewGradeTest() {
        Course easyEnglish = new Course("ENGL", 0100, 0.5);
        Course mediumMath = new Course("APMA", 1655, 1);
        Course crazyCompSci = new Course("CSCI", 0200, 1.5);
        Student emilyM = new Student("Emily M", easyEnglish, mediumMath);
        Student ericC = new Student("Eric C", easyEnglish, crazyCompSci);
        Student marthaC = new Student("Martha C", mediumMath, crazyCompSci);
        Faculty csTeacher = new Faculty("CS Prof", "CSCI", crazyCompSci);
        Faculty mathTeacher = new Faculty("Math Prof", "MATH", mediumMath);
        Faculty englTeacher = new Faculty("English Prof", "ENGL", easyEnglish);
        TA tannerTA = new TA("Tanner", easyEnglish, mediumMath, crazyCompSci);
        TA teresaTA = new TA("Teresa", easyEnglish, crazyCompSci, mediumMath);
        TA tylerTA = new TA("Tyler", mediumMath, crazyCompSci, easyEnglish);
        IGrade letterGradeA = new LetterGrade(sol.Letter.A);
        IGrade letterGradeNC = new LetterGrade(sol.Letter.NC);
        IGrade SNCGradeS = new SNCGrade(sol.SNC.S);
        GradeReport emilyGrades = new GradeReport(emilyM, easyEnglish, letterGradeA);
        GradeReport ericGrades = new GradeReport(ericC, crazyCompSci, letterGradeNC);
        GradeReport marthaGrades = new GradeReport(marthaC, mediumMath, SNCGradeS);
        Assert.assertEquals("NC", csTeacher.viewGrade(ericGrades));
        Assert.assertEquals("A", tylerTA.viewGrade(emilyGrades));
        Assert.assertEquals("S", teresaTA.viewGrade(marthaGrades));
        Assert.assertEquals("NC", tannerTA.viewGrade(ericGrades));
    }

    @Test(expected = RuntimeException.class)
    public void viewGradesException() {

    }





}
/*

 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
private Student student;
    @Before
    public void setUp() {
        this.student =  new Student(1, "Juan");
    }
    @Test
    public void testStudentConstructor() {

        assertEquals(1, student.getId());
        assertEquals("Juan", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
        Student craig = new Student(27, "Craig Craiger");
        assertEquals(27, craig.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Juan", student.getName());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        assertEquals("Jenn Ann Hologram", jenn.getName());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(78);
        student.addGrade(84);
        student.addGrade(99);

        assertEquals(3, student.getGrades().size());
        student.addGrade(88);
        assertEquals(4, student.getGrades().size());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        jenn.addGrade(100);
        assertEquals(1, jenn.getGrades().size());
    }

    @Test
    public void getGrades() {
        assertEquals(0, student.getGrades().size());
        student.addGrade(34);
        assertEquals(1, student.getGrades().size());
    }

    @Test
    public void testGetGradeAverage() {
        student.addGrade(75);
        student.addGrade(25);
        student.addGrade(50);
        assertEquals(50, student.getGradeAverage(), 0);
        student.addGrade(10);
        assertEquals(40, student.getGradeAverage(), 0);
        student.addGrade(100);
        student.addGrade(100);
        assertEquals(60, student.getGradeAverage(), 0);

    }
}

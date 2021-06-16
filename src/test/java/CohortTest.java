import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student jenn;
    private Student juan;

    @Before
    public void setUp() {
        this.cohort = new Cohort();
        this.juan = juan;
    }

    @Test
    public void testAddStudent() {
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(7, "Jim Johnly"));
      //  assertEquals(cohort.getStudents().size());
        cohort.addStudent(new Student(7, "Jim Johnly"));
        assertEquals(2, cohort.getStudents().size());
        Student juan = new Student(1, "Juan Perez");
        cohort.addStudent(juan);
        assertEquals(juan, cohort.getStudents().get(2));

    }

    @Test
    public void testGetStudents() {
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim Johnly", cohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage(){
        Cohort cohort = new Cohort();
        Student juan = new Student(1, "Juan Perez");
        juan.addGrade(50);
        juan.addGrade(75);
        juan.addGrade(25);
        Student jenn = new Student(12, "Jenn Ann Hologram");
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
        cohort.addStudent(juan);
        cohort.addStudent(jenn);
        assertEquals(75, cohort.getCohortAverage(), 0);
    }
}

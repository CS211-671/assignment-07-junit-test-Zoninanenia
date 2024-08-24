package ku.cs.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent2Parameters() {
        studentList.addNewStudent("66104", "Sakchai Thasthep");
        Student student = studentList.findStudentById("66104");
        assertNotNull(student);
        assertEquals("Sakchai Thasthep", student.getName());
    }

    @Test
    void testAddNewStudent3Parameters() {
        studentList.addNewStudent("66104", "Sakchai Thasthep", 91);
        Student student = studentList.findStudentById("66104");
        assertNotNull(student);
        assertEquals("Sakchai Thasthep", student.getName());
        assertEquals(91, student.getScore());
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("66104", "Sakchai Thasthep");
        studentList.giveScoreToId("66104", 15);
        Student student = studentList.findStudentById("66104");
        assertNotNull(student);
        assertEquals(15, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("66104", "Sakchai Thasthep", 15);
        String grade = studentList.viewGradeOfId("66104");
        assertNotNull(grade);
        assertEquals("F", grade);
    }

    @Test
    void testFindStudentById() {
        studentList.addNewStudent("66104", "Sakchai Thasthep");
        Student student = studentList.findStudentById("66104");
        assertNotNull(student);
        assertEquals("Sakchai Thasthep", student.getName());
    }

    @Test
    void testGetStudents() {
        studentList.addNewStudent("66104", "Sakchai Thasthep");
        studentList.addNewStudent("66105", "Zania");
        assertEquals(2, studentList.getStudents().size());
    }


}
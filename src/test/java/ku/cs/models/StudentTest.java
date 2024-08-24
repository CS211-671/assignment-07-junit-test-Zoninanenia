package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.* ;


class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 99 คะแนน")
    void testAddScore(){
        Student s = new Student("6610450099", "Jinnaphat Theparat");
        s.addScore(99);
        assertEquals(99, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 15 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6610450099", "Jinnaphat Theparat");
        s.addScore(15);
        assertEquals("F", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบ ID")
    void testIsId(){
        Student s = new Student("6610450099", "Jinnaphat Theparat");
        assertTrue(s.isId("6610450099"));
    }

    @Test
    void testChangName(){
        Student s = new Student("6610450099", "Jinnaphat Theparat");
        assertEquals("Jinnaphat Theparat", s.getName());
        s.changeName("Zania");
        assertEquals("Zania", s.getName());

    }

}
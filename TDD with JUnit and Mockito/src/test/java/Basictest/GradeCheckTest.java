package Basictest;
import org.junit.Test;
import static org.junit.Assert.*;
public class GradeCheckTest {
        GradeCheck s = new GradeCheck();
        @Test
        public void testPass() {
            assertTrue(s.isPassed(70));
        }
        @Test
        public void testFail() {
            assertFalse(s.isPassed(20));
        }
        @Test
        public void testGrade() {
            assertEquals("A", s.calculateGrade(95));
        }
}

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    Visitor charlie = new Visitor("charlie copper",25, LocalDate.of(2014,12,12), LocalTime.of(12,20),"No bad","Joe");

    @Test
    void TestSave() {
        assertEquals("File Saved", charlie.save());

    }

    @Test
    public void TestLoad() {
        assertEquals(
                "charlie_copper\n"+
                "25\n"+
                "2014-12-12\n"+
                "12:20\n"+
                "No bad\n" +
                "Joe\n",charlie.load("charlie copper"));

        assertEquals("File does not exist", charlie.load("cadfafe dfs"));

    }
}
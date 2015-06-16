import java.lang.Exception;

import org.junit.Before;
import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @Test
    public void testTriangle() throws Exception {
        assertEquals("*", triangle.easy(3));
    }

    @Test
    public void testHorizontal() throws Exception {
        assertEquals("******", triangle.horizontal(6));
    }

    @Test
    public void testVertical() throws Exception {
        assertEquals("*\n" + "*\n", triangle.vertical(2));
    }

    @Test
    public void testRight() throws Exception {
        assertEquals("*\n" + "**\n" + "***\n", triangle.rightTriangle(3));


    }
}
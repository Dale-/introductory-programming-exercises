import java.lang.Exception;

import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleTest {

    @Test
    public void testTriangle() throws Exception {
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.easy(3));
    }

}
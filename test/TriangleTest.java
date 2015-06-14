import java.lang.Exception;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testEasy() throws Exception {
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.easy());
    }

}
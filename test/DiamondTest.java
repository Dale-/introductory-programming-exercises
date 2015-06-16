
import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DiamondTest {

    private Diamond diamond;

    @Before
    public void setUp() throws Exception {
        diamond = new Diamond();
    }

    @Test
    public void testIsoceles() throws Exception {
        assertEquals("  *\n" + " ***\n" + "*****\n", diamond.isosceles_triangle(3));
    }

    @Test
    public void testDiamond() throws Exception {
        assertEquals("  *\n" + " ***\n" + "*****\n" + " ***\n" + "  *\n", diamond.diamond(3));
    }

    @Test
    public void testName() throws Exception {
        assertEquals("  *\n" + " ***\n" + "Dale\n" + " ***\n" + "  *\n", diamond.diamondWithName(3,"Dale"));
    }
}

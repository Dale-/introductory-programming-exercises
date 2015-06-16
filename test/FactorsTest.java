import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FactorsTest {
    @Test
    public void testFactorsOf() throws Exception {
        Factors factors = new Factors();
        assertEquals("2,3,5", factors.generate(30));
    }
}
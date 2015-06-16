import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testCountUpTo() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1\n" + "2\n" + "Fizz\n" +
                     "4\n" + "Buzz\n" + "Fizz\n" +
                     "7\n" + "8\n" + "Fizz\n" + "Buzz\n" +
                     "11\n" + "Fizz\n" + "13\n" +
                     "14\n" + "FizzBuzz\n", fizzBuzz.fizzBuzz(15));
    }
}
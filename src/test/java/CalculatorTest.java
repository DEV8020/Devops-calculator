import org.example.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Main calculator = new Main();

    @Test
    public void factorialTruePositive() {


        assertEquals("Finding factorial of a number for True Positive", 2, calculator.factorial(2), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 69, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 42, calculator.factorial(7), DELTA);
    }
    //fact ends

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding power for True Positive", 25, calculator.power(5, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 6, calculator.power(4, 2), DELTA);
        assertNotEquals("Finding power for True Negative", -6920, calculator.power(-5, 10), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, calculator.naturalLog(300), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for True Negative", 420, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 12, calculator.squareRoot(144), DELTA);
        assertEquals("Finding square root for True Positive", 13, calculator.squareRoot(169), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 69, calculator.squareRoot(400), DELTA);
        assertNotEquals("Finding square root for True Negative", -42, calculator.squareRoot(42), DELTA);
    }


}

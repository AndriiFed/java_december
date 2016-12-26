import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void testFactorial() {
        int result = Factorial.calculate(5);
        Assert.assertEquals(120, result);
    }

    @Test
    public void testNegativesFactorial() {
        int result = Factorial.calculate(-5);
        Assert.assertEquals(0, result);
    }

}

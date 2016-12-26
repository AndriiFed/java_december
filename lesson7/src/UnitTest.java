import org.junit.Test;
import org.junit.Assert;

public class UnitTest {

    @Test
    public void testFactorial() {
        int result = Factorial.calculate(5);
        Assert.assertEquals(120, result);
    }
}

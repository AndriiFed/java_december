package calculator;

import static org.junit.Assert.assertThat;

import org.junit.*;

import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Before Class");
    }

    @Before
    public void setUp() {
        System.out.println("In Before");
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        System.out.println("In Addition");
        int result = calculator.add(5, 8);
        assertThat(result, is(13));
    }

    @Test
    public void testMultiplication() {
        System.out.println("In Multiplication");
        int result = calculator.multiplication(5, 8);
        assertThat(result, is(40));
    }

    @After
    public void tearDown() {
        System.out.println("In After");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("After Class");
    }
}

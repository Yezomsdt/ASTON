import org.example.Factorial2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTestNG {

    private final Factorial2 factorialCalculator = new Factorial2();

    @Test
    public void testFactorialOfZero() {
        long result = factorialCalculator.factorial2(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = factorialCalculator.factorial2(5);
        Assert.assertEquals(result, 120, "Факториал 5 должен быть равен 120");

        result = factorialCalculator.factorial2(10);
        Assert.assertEquals(result, 3628800, "Факториал 10 должен быть равен 3628800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        factorialCalculator.factorial2(4);
    }
}
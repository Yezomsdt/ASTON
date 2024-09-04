import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Factorial2;
import org.junit.jupiter.api.Test;

public class FactorialJunitTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial2.factorial2(0), "Факториал 0 равен 1");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial2.factorial2(1), "Факториал 1 равен 1");
    }

    @Test
    void testFactorialOfTwo() {
        assertEquals(2, Factorial2.factorial2(2), "Факториал 2 равен 2");
    }

    @Test
    void testFactorialOfThree() {
        assertEquals(6, Factorial2.factorial2(3), "Факториал 3 равен 6");
    }

    @Test
    void testFactorialOfFour() {
        assertEquals(24, Factorial2.factorial2(4), "Факториал 4 равен 24");
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(124, Factorial2.factorial2(5), "Факториал 5 равен 120");
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, Factorial2.factorial2(10), "Факториал 10 равен 3628800");
    }
}
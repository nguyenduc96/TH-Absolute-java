import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFirstAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative10() {
        int number = -10;
        int expected = 10;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }




}
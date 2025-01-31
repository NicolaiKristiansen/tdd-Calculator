package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Adding to numbers together")
    void testAdd(){
        int expected = 18;
        int actual = Calculator.add(10, 8);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtracting numbers from each other")
    void testSubtract(){
        int expected = 47;
        int actual = Calculator.subtract(50, 3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtracting numbers from each other")
    void testMultiply(){
        int expected = 120;
        int actual = Calculator.multiply(10, 12);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtracting numbers from each other")
    void testDivide(){
        int expected = 5;
        int actual = Calculator.divide(10, 2);
        assertEquals(expected, actual);
    }

}
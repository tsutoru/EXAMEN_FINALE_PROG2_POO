package main;

// CalculatorTest.java
import School.hei.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDeMain {

    @Test
    public void testAddition() {
        Main calc = new Main();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAdditionFail() {
        Main calc = new Main();
        assertEquals(6, calc.add(2, 3)); // Ce test va échouer
    }
}

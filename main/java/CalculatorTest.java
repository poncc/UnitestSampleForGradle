import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public  Calculator calculator = new Calculator();

    @Test
    public void add_positive_integers(){
        sumShouldBe(3, 1, 2);
    }

    private void sumShouldBe(int expected, Integer first, Integer second) {
        assertEquals(expected, calculator.add(first, second),0);
    }
}

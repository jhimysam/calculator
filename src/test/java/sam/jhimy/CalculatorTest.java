package sam.jhimy;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void startCalculator(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.value());
    }
    @Test
    public void add(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }
    @Test
    public void subtraction(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.subtraction(5,3));
    }
    @Test
    public void multiplication(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiplication(2,3));
    }
    @Test
    public void division(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(6,3));
    }
}

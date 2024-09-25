package test.demo.parallel;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ComplexTest {
    @Test
    void testDivide() {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -1);
        Complex result = c1.divide(c2);
        assertEquals(-0.5, result.getRe(), 1e-9);
        assertEquals(2.5, result.getIm(), 1e-9);
    }
    @Test
    void testModulus() {
        Complex c = new Complex(3, 4);
        double result = c.modulus();
        assertEquals(5, result, 1e-9); // 5.0 is the modulus of 3 + 4i
    }
    @Test
    void testPow() {
        Complex c = new Complex(2, 3);
        Complex result = c.pow(2);
        assertEquals(-5, result.getRe());
        assertEquals(12, result.getIm());
    }
}
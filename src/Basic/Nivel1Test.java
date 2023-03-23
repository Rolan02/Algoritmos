package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Nivel1Test {

    @Test
    public void sumTest() {
        assertEquals(30,Nivel1.sum(15,15));
    }
    @Test
    public void sumTestNumberNegatives() {
        assertEquals(-9,Nivel1.sum(-3,-6));
    }
    @Test
    public void sumTestNumber() {
        assertEquals(17,Nivel1.sum(7,10));
    }
    @Test
    public void convertTest() {
        assertEquals(360,Nivel1.convert(6));
    }
    @Test
    public void convertTestLongNumber() {
        assertEquals(33600,Nivel1.convert(560));
    }
    @Test
    public void additionTestNumber() {
        assertEquals(10,Nivel1.addition(9));
    }
    @Test
    public void additionTestNumberNegative() {
        assertEquals(-8,Nivel1.addition(-9));
    }
}
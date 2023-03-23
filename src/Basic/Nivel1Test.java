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

    @Test
    public void test1() {
        assertEquals(3, Nivel1.countWords("It's high noon"));
    }

    @Test
    public void test2() {
        assertEquals(4, Nivel1.countWords("Is this easy mode"));
    }

    @Test
    public void test3() {
        assertEquals(5, Nivel1.countWords("What an easy task, right"));
    }

    @Test
    public void test4() {
        assertEquals(4, Nivel1.countWords("This is a test"));
    }

    @Test
    public void test5() {
        assertEquals(6, Nivel1.countWords("Just an example here move along"));
    }

    @Test
    public void test6() {
        assertEquals(4, Nivel1.countWords("How are you today?"));
    }
}
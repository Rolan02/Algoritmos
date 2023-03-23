package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EasyTest {

    @Test
    public void sumTest() {
        assertEquals(30, Easy.sum(15,15));
    }
    @Test
    public void sumTestNumberNegatives() {
        assertEquals(-9, Easy.sum(-3,-6));
    }
    @Test
    public void sumTestNumber() {
        assertEquals(17, Easy.sum(7,10));
    }
    @Test
    public void convertTest() {
        assertEquals(360, Easy.convert(6));
    }
    @Test
    public void convertTestLongNumber() {
        assertEquals(33600, Easy.convert(560));
    }
    @Test
    public void additionTestNumber() {
        assertEquals(10, Easy.addition(9));
    }
    @Test
    public void additionTestNumberNegative() {
        assertEquals(-8, Easy.addition(-9));
    }

    @Test
    public void test1() {
        assertEquals(3, Easy.countWords("It's high noon"));
    }

    @Test
    public void test2() {
        assertEquals(4, Easy.countWords("Is this easy mode"));
    }

    @Test
    public void test3() {
        assertEquals(5, Easy.countWords("What an easy task, right"));
    }

    @Test
    public void test4() {
        assertEquals(4, Easy.countWords("This is a test"));
    }

    @Test
    public void test5() {
        assertEquals(6, Easy.countWords("Just an example here move along"));
    }

    @Test
    public void test6() {
        assertEquals(4, Easy.countWords("How are you today?"));
    }
}
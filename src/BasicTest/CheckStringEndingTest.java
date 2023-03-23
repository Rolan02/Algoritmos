package BasicTest;

import Basic.CheckStringEnding;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CheckStringEndingTest {

    @Test
    public void whenTheString2ContainsString1_thenReturnTrue() {
        assertEquals(true, CheckStringEnding.checkEnding("abc", "bc"));
    }

    @Test
    public void whenTheString2NotContainsString1_thenReturnFalse() {
        assertEquals(false, CheckStringEnding.checkEnding("abc", "d"));
    }

    @Test
    public void whenTheString2ContainsString1_thenReturnFalse() {
        assertEquals(false, CheckStringEnding.checkEnding("samurai", "zi"));
    }

    @Test
    public void whenTheString2ContainsString1_thenReturnTrue2() {
        assertEquals(true, CheckStringEnding.checkEnding("feminine", "nine"));
    }

    @Test
    public void whenTheString2ContainsString1_thenReturnFalse2() {
        assertEquals(false, CheckStringEnding.checkEnding("convention", "tio"));
    }
}
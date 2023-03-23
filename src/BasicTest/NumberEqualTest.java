package BasicTest;

import Basic.NumberEqual;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberEqualTest {

    @Test
    public void whenNumberIsEquals_thenReturnTrue(){
        assertEquals(true, NumberEqual.isSameNum(2,2));
    }
    @Test
    public void whenNumberIsNotEquals_thenReturnFalse(){
        assertEquals(false, NumberEqual.isSameNum(0, 6));
    }
    @Test
    public void whenNumberIsNotEquals_thenReturnFalse2(){
        assertEquals(false, NumberEqual.isSameNum(43, 32));
    }
}
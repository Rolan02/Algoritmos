package BasicTest;

import Basic.SumNumber;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumNumberTest {

    @Test
    public void whenSumTwoNumber_thenReturnTwoNumber() {
        Assert.assertEquals(30, SumNumber.sum(15,15));
    }
    @Test
    public void whenSumTwoNumber_thenReturnTwoNumber2() {
        assertEquals(-9, SumNumber.sum(-3,-6));
    }
    @Test
    public void whenSumTwoNumber_thenReturnTwoNumber3() {
        assertEquals(17, SumNumber.sum(7,10));
    }
}
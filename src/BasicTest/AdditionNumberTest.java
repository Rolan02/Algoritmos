package BasicTest;

import Basic.AdditionNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionNumberTest {
    @Test
    public void whenAdditionNumberInOne_thenReturnNumberAddition1() {
        assertEquals(10, AdditionNumber.addition(9));
    }
    @Test
    public void whenAdditionNumberInOne_thenReturnNumberAddition() {
        assertEquals(-8, AdditionNumber.addition(-9));
    }
}
package BasicTest;

import Basic.ExistsHigher;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExistsHigherTest {

    @Test
    public void whenNumIsGreater_thenReturnTrue() {
        assertTrue(ExistsHigher.existsHigher(new int[] {5,3,15,22,4}, 10));
    }
    @Test
    public void whenNumIsLess_thenReturnFalse() {
        assertFalse(ExistsHigher.existsHigher(new int[] {1, 2, 3, 4, 5}, 8));
    }
    @Test
    public void whenNumIsEquals_thenReturnTrue() {
        assertTrue(ExistsHigher.existsHigher(new int[] {4, 3, 3, 3, 2, 2, 2}, 4));
    }
    @Test
    public void whenArrayIsEmpty_thenReturnFalse() {
        assertFalse(ExistsHigher.existsHigher(new int[] {}, 4));
    }
}
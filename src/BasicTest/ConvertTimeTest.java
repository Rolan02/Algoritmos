package BasicTest;

import Basic.ConvertTime;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTimeTest {
    @Test
    public void whenConvertHour_thenReturnHourAMinutes() {
        assertEquals(360, ConvertTime.convert(6));
    }
    @Test
    public void whenConvertHour_thenReturnHourAMinutes2() {
        assertEquals(33600, ConvertTime.convert(560));
    }
}
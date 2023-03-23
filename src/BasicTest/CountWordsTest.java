package BasicTest;

import Basic.CountWords;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordsTest {
    @Test
    public void whenCountWord_thenReturnNumberOfWords() {
        assertEquals(3, CountWords.countWords("It's high noon"));
    }

    @Test
    public void whenCountWord_thenReturnNumberOfWords2() {
        assertEquals(4, CountWords.countWords("Is this easy mode"));
    }

    @Test
    public void whenCountWord_thenReturnNumberOfWords3() {
        assertEquals(5, CountWords.countWords("What an easy task, right"));
    }

    @Test
    public void whenCountWord_thenReturnNumberOfWords4() {
        assertEquals(4, CountWords.countWords("This is a test"));
    }

    @Test
    public void whenCountWord_thenReturnNumberOfWords5() {
        assertEquals(6, CountWords.countWords("Just an example here move along"));
    }
}
package BasicTest;

import Basic.ShuffleName;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShuffleNameTest {

    @Test
    public void whenShuffleName_thenReturnInvert() {
        assertEquals("Trump Donald", ShuffleName.nameShuffle("Donald Trump"));
    }

    @Test
    public void whenShuffleName_thenReturnInvert2() {
        assertEquals("O'Donnel Rosie", ShuffleName.nameShuffle("Rosie O'Donnel"));
    }

    @Test
    public void whenShuffleName_thenReturnInvert3() {
        assertEquals("Kennedy Ken", ShuffleName.nameShuffle("Ken Kennedy"));
    }

    @Test
    public void whenShuffleName_thenReturnInvert4() {
        assertEquals("Gonzalez Allison", ShuffleName.nameShuffle("Allison Gonzalez"));
    }

    @Test
    public void whenShuffleName_thenReturnInvert5() {
        assertEquals("Frazier Albert", ShuffleName.nameShuffle("Albert Frazier"));
    }
}
package BasicTest;

import static org.hamcrest.core.Is.is;

import Basic.CountBoolean;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CountBooleanTest {

    @Test
    public void whenArrayContainTrue_thenReturnSize() {
        assertThat(CountBoolean.countTrue(new boolean[] { true, false, false, true, false }), is(2));
    }

    @Test
    public void whenArrayNotContainTrue_thenReturnSize() {
        assertThat(CountBoolean.countTrue(new boolean[] { false, false, false, false }), is(0));
    }

    @Test
    public void whenArrayIsEmpty_thenReturnSize() {
        assertThat(CountBoolean.countTrue(new boolean[] {}), is(0));
    }

    @Test
    public void whenArrayContainTrue_thenReturnSize2() {
        assertThat(
                CountBoolean.countTrue(new boolean[] { true, false, true, true, true, false, true, true, false, false }),
                is(6));
    }

    @Test
    public void whenArrayContainTrue_thenReturnSize3() {
        assertThat(
                CountBoolean.countTrue(
                        new boolean[] { false, false, false, false, true, false, true, false, true, false, false }),
                is(3));
    }

    @Test
    public void whenArrayContainTrue_thenReturnSize4() {
        assertThat(
                CountBoolean.countTrue(
                        new boolean[] { true, false, false, false, true, false, false, true, false, false, false }),
                is(3));
    }
}
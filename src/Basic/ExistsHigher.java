package Basic;

import java.util.Arrays;

public class ExistsHigher {

    public static boolean existsHigher(int[] array, int num) {
        return Arrays.stream(array).anyMatch(value -> value >= num);
    }
}

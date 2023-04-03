package Basic;

public class ExistsHigher {

    public static boolean existsHigher(int[] array, int num) {
        for (int i : array ) {
            if ( i >= num ) {
                return true;
            }
        }
        return false;
    }
}

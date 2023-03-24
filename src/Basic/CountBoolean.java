package Basic;

public class CountBoolean {

    /**
     *
      * @param arr
     * @return
     * @author Bryan Gregory
     */
    public static int countTrue(boolean[] arr) {
        //implementa aqui tu algoritmo
        int countTrue = 0;
    for (boolean valor : arr) {
        if (valor) {
            countTrue++;
        }
    }
        return countTrue;
    }
    
}

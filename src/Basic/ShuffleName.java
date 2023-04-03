package Basic;

public class ShuffleName {

    /**
     *
     * @param string
     * @return
     * @author Elver Loza
     */
    public static String nameShuffle(String string) {
        String[] name = string.split(" ");
        return  name[1] + " " + name[0];
    }




}

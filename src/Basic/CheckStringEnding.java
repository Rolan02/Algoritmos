package Basic;

public class CheckStringEnding {

    /**
     *
     * @param str1
     * @param str2
     * @return
     * @author Rodrigo Paniagua
     */
    public static boolean checkEnding(String str1, String str2) {
        return  str1.endsWith(str2);

        //String substring = str1.substring(str1.length() - str2.length());
       // return str2.equals(substring);
    }
}

package Basic;

public class Main {
    public static void main(String[] args) {
        String str1 = "rodrigo";
        String str2 = "rigo";
        String substring = str1.substring(str1.length() - str2.length());

        System.out.println(substring);

    }
}

public class countVowels {
    public static int CountVowels(String palabra) {
        String Palabra ="murcielago";
        int contador = 0;
        for(int x=0;x<Palabra.length();x++) {
            if ((Palabra.charAt(x)=='a') || (Palabra.charAt(x)=='e') || (Palabra.charAt(x)=='i') || (Palabra.charAt(x)=='o') || (Palabra.charAt(x)=='u')){ 
               contador++;
             }
           }
           return contador;
    }
    
}

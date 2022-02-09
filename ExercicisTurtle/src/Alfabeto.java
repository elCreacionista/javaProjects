import java.util.Arrays;
import java.util.Map;

public class Alfabeto{

    public static void main(String[] args) {
        String s = "You can split a String by whitespaces or tabs in Java by using the split " +
                "method of java. lang. String class. This method accepts a regular expression " +
                "and you can pass a regex matching with whitespace to split the String where " +
                "words are separated by spaces.";
        Alfabeto al = new Alfabeto(s);
    }


    Alfabeto(String Palabras){
        Palabras =  Palabras.replace(".", "");
        String[] arr = Palabras.split(" ");
        for (int i = 0; i < arr.length; i++) {
            Palabra p = new Palabra(arr[i]);
        }

    }

    class Palabra{
        String palabra;
        Palabra(String p){
            palabra = p;
        }


    }

}

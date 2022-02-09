import java.lang.reflect.Array;
import java.util.Arrays;

public class Caesar {


    static String cypher(String s, int delta) {
        int positiu = delta < 0 ? -1 : 1;
        s = s.toUpperCase();
        //s = Normalificador.Normalificar(s);
        StringBuilder resultat = new StringBuilder();
        char deltachar = Normalificador.getChar(delta);
        System.out.println(deltachar);
        for (int i = 0; i < s.length(); i++) {
            resultat.append(Normalificador.SumarLletres(s.charAt(i), deltachar));
        }


        return resultat.toString();
    }

    static String decypher(String s, int delta) {
        return cypher(s, -delta);
    }

    static String magic(String s, String ss, String resposta) {
        s = Normalificador.Normalificar(s);
        ss = Normalificador.Normalificar(ss);
        resposta = Normalificador.Normalificar(resposta);

        for (int i = 0; i < s.length(); i++) {
            System.out.println("s" + (int)s.charAt(i) + "ss" + (int)(ss.charAt(i)) + "resposta" + (int)(resposta.charAt(i)));
        }
        System.out.println(s);
        System.out.println(ss);
        return "";
    }
}

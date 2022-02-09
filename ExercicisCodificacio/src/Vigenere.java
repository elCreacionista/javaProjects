
public class Vigenere {

    static String encode(String s, String password) {
        s = Normalificador.Normalificar(s);
        password = Normalificador.Normalificar(password);
        StringBuilder resultat = new StringBuilder();
        int espais = 0;
        for (int i = 0; i <s.length() ; i++) {
            if((int)s.charAt(i) > 90 || (int)s.charAt(i) < 65) {
                espais++;
                resultat.append(s.charAt(i));
                continue;
            }
            int actual = password.charAt(( (i - espais) % password.length())) - 64;
            System.out.println(actual);
            resultat.append(Caesar.cypher("" + s.charAt(i), actual));
        }
        return resultat.toString();
    }

    static String decode(String s, String password) {
        return "";
    }
}




public class Normalificador {

    static char[] abecedari = new char[]{
            65,66,67,68,69,70,71,72,73,
            74,75,76,77,78,79,80,81,82,
            83,84,85,85,86,87,88,89,90
    };

    static String Normalificar(String s){
        s = s.toLowerCase();
        s = s.replace("à", "a").replace("í", "i").replace("ó", "o").replace("é", "e").replace("è", "e");
        s = s.toUpperCase();
        return s;
    }
    static boolean EsUnaLletra(char c){
        return getInt(c) < 27 && getInt(c) >= 1;
    }

    static int getInt(char c){
        return (int) c - 64;
    }
    static char getChar(int i){
        i %= 27;
        return (char)(i + 64);
    }
    static char SumarLletres(char a, char b){
        int nombre = getInt(a) + getInt(b);
        if (nombre < 27){
            return getChar(nombre);
        }
        return getChar(nombre % 26);
    }
}

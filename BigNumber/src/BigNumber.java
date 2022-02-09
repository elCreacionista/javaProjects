class BigNumber {

    private String numero;
    // Constructor 1
    public BigNumber(String s) {
        this.numero = RemoveZeros(s);
        System.out.println(toString());
    }
    // Constructor 2
    public BigNumber(BigNumber b) {
        this.numero = RemoveZeros(b.toString());
    }
    // Suma
    public static void main(String[] args) {
        BigNumber bn1 = new BigNumber("2000");
        BigNumber bn2 = new BigNumber("1");
        //System.out.println(5195 - 1919);
        System.out.println(bn1.add(bn2).numero);

    }

    private int getNumber(char c){
        return ((int) c) - 48;
    }
    private String invertirNumero(String s){
        StringBuilder resultat = new StringBuilder();
        int n = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            resultat.append(s.charAt(n - i));
        }
        return resultat.toString();
    }

    // Suma
    BigNumber add(BigNumber other) {
        boolean PrimerLlarg = this.numero.length() > other.numero.length();

        int tamany = PrimerLlarg ? this.numero.length() : other.numero.length();

        if (PrimerLlarg)
            other.numero = AddZeros(other.numero, tamany);
        else
            this.numero = AddZeros(this.numero, tamany);



        int a, b, llevando = 0;

        StringBuilder resultat = new StringBuilder();
        for (int i = tamany - 1; i >= 0; i--) {
            a = this.getNumber(this.numero.charAt(i));
            b = this.getNumber(other.numero.charAt(i));
            if (a + b + llevando > 9){
                resultat.append((a + b + llevando) - 10);
                llevando = 1;
            }
            else {
                resultat.append((a + b + llevando));
                llevando = 0;
            }
        }
        if (llevando == 1){
            resultat.append("1");
        }

        return new BigNumber(this.invertirNumero(resultat.toString()));
    }


    boolean iszero(){
        return this.compareTo(new BigNumber("0")) == 0;
    }
    // Multiplica
    BigNumber mult(BigNumber other) {
        BigNumber contador = new BigNumber("0");
        BigNumber resultat = new BigNumber("0000");
        while (!contador.equals(this)){
            contador = contador.add(new BigNumber("1"));
            resultat = resultat.add(other);
        }
        return resultat;
    }

    //Resta
    BigNumber sub(BigNumber other) {

        int a, b, llevando = 0;

        StringBuilder resultat = new StringBuilder();
        for (int i = this.numero.length() - 1; i >= 0; i--) {
            a = this.getNumber(this.numero.charAt(i));
            b = this.getNumber(other.numero.charAt(i));
            if ((a - llevando) - b >= 0){
                resultat.append((a  - llevando) - b);
                llevando = 0;
            }
            else {
                resultat.append(((a - llevando) - b) + 10);
                llevando = 1;
            }

        }
        if (llevando == 1){
            resultat.append("1");
        }

        return new BigNumber(this.invertirNumero(resultat.toString()));
    }
    // Divideix
    BigNumber div(BigNumber other) {

        return other;
    }
    // Arrel quadrada
    BigNumber sqrt() {

        return new BigNumber("s");
    }
    // Potència
    BigNumber power(int n) {
        return new BigNumber("a");
    }
    // Factorial
    BigNumber factorial() {
        return new BigNumber("a");
    }


    // MCD. Torna el Màxim comú divisor
    BigNumber mcd(BigNumber other) {
        return other;

    }
    // Compara dos BigNumber. Torna 0 si són iguals, -1
// si el primer és menor i torna 1 si el segon és menor
    public int compareTo(BigNumber other) {
        if (equals(other)){
            System.out.println("Son iguales");
            return 0;
        }

        if (toString().length() != other.toString().length())
            return toString().length() < other.toString().length() ? -1 : 1;

        System.out.println("Diferente tamanio");


        for (int i = 0; i < toString().length(); i++) {
            if (toString().charAt(i) == other.toString().charAt(i))
                continue;
            if (toString().charAt(i) > other.toString().charAt(i))
                return 1;
            if (toString().charAt(i) < other.toString().charAt(i))
                return -1;
        }
        System.out.println("No Se que hago aqui");


        return 0;

    }
    // Torna un String representant el número
    public String toString() {
        return this.numero;
    }

    private String RemoveZeros(String s){
        StringBuilder sb = new StringBuilder();
        boolean ceros = true;
        for (int i = 0; i < s.length(); i++) {
            if (ceros && s.charAt(i) == '0')
                continue;
            else {
                ceros = false;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    private String AddZeros(String s, int lenght){
        StringBuilder newS = new StringBuilder();
        int n = s.length();
        while (n < lenght){
            newS.append("0");
            n++;
        }
        return newS.toString().concat(s);
    }
    // Mira si dos objectes BigNumber són iguals
    public boolean equals(Object other) {
        System.out.println(other.toString());
        return toString().equals(other.toString());
        //return RemoveZeros(this.toString()).equals(RemoveZeros(other.toString()));
    }
}
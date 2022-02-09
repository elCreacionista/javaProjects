import java.util.Arrays;

public class Exercicis {

    public static void main(String[] args) {
        //Senars(100);
        //System.out.println(CtoF(32));
        //Cuadrats(50);
        //Tabla(3);
        //System.out.println(Primers());
        //Multiples();
        //System.out.println(Arrays.toString(SegonGrau(1,-4,4)));
        //Hora(25,30);
        //MCD(12,15,6);
        //System.out.println(factorial(5));
        //System.out.println(nota(110));
        //wile();
        Bucle();
    }

    public static void Bucle(){

        // El bucle s'executa infinitament, la variable i augmenta una vegada per iteració
        // excepte quan es major o igual a deu que ja no entra al primer if, per tant
        // quan es deu augmenta a once i ja no es compleix la condició que tenim per sortir

        int i = 0;
        while (true) {
            i ++;
            if (i <10)
                continue;
            i ++;
            if (i== 10)
                break;
        }
    }

    //EXERCICI1
    public static void Senars(int cuants){
        for (int i = 1; i <= cuants; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //EXERCICI2
    public static double CtoF(double Celsius){
        return (Celsius * 1.8) + 32;
    }

    //EXERCICI3
    public static void Cuadrats(int cuants_numeros){
        double inicial = 2;
        for (int i = 0; i < cuants_numeros; i++) {
            System.out.println(inicial);
            inicial *= 2;
        }
    }

    //EXERCICI4
    public static void Tabla(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    //EXERCICI5
    public static int Primers(){
        int suma = 0;
        for (int i = 1; i <= 40; i++) {
            suma += i;
        }
        return suma;
    }

    //EXERCICI6
    public static void Multiples(){
        for (int i = 1; i <= 30; i++) {
            if ((5 * i) % 3 != 0)
                System.out.println(i * 5);
        }
    }

    //EXERCICI7
    public static double[] SegonGrau(int ixcuadrat, int ix, int terme_independent){
        /*   -b+-sqrt(b*b-4ac) / 2a;   */
        double dinsarrel = (ix * ix) - (4 * ixcuadrat * terme_independent);
        if (dinsarrel < 0){
            return null;
        }
        double arrel =  Math.sqrt(dinsarrel);
        double divisor = 2 * ixcuadrat;
        System.out.println(arrel + " " + divisor);
        return new double[]{(-ix + arrel) / divisor, (-ix - arrel) / divisor};
    }

    //EXERCICI8
    public static void Hora( int hores, int minuts){
        if (hores < 0 || hores > 24 || minuts < 0 || minuts > 60){
            System.out.println("Hora invàlida");
            return;
        }
        if (hores <= 12){
            System.out.println(hores + ":" + minuts + "AM");
        }
        else{
            hores -= 12;
            System.out.println(hores + ":" + minuts + "PM");

        }
    }

    /*
                INCOMPLET
    //EXERCICI9
    public static void MCD(int a, int b, int c){}
    */

    //EXERCICI10
    public static int factorial(int numero){
        int resultat = 1;
        for (int i = numero; i >= 1; i--) {
            resultat *= i;
        }
        return resultat;
    }

    //EXERCICI13
    public static String nota(double nota){
        if (nota > 12)
            return "Nota invàlida";
        if (nota < 5)
            return "Insuficient";
        if (nota == 5)
            return "Suficient";
        if (nota == 6)
            return "Be";
        if (nota < 9)
            return "Notable";
        return "Exel·lent";
    }

    //EXERCICI14
    public static void wile() {
        //for( a=0,b=0; a < 7; a++,b+=2 ) //
        int a = 0;
        int b = 0;
        while (a < 7) {
            a++;
            b += 2;
        }
        System.out.println("a=" + a + " b=" + b);
    }

}

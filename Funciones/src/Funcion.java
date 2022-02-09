public class Funcion {
    double constante = 3.7;
    Representador rp;
    Funcion(){}
    public void Representar(double[] valores){
        //HACER ECUACION
        double[] resultados = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            resultados[i] = valores[i] * constante;
        }

        this.rp = new Representador(valores, resultados);
        rp.Mostrar();
    }
}

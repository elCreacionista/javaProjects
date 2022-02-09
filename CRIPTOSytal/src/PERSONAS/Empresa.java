package PERSONAS;

public class Empresa {
    double Capital;
    Monedero monedero;
    Persona[] empresarios;

    Empresa(double capital, Persona[] fundadores){
        this.Capital = capital;
        empresarios = new Persona[fundadores.length];
    }
}

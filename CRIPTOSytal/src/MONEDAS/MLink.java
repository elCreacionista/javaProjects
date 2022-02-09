package MONEDAS;

public class MLink {
    public Moneda CrearMoneda(double precio){
        return new Moneda(precio);
    }
    public Cryptomoneda CrearCriptomoneda(double precio){
        return new Cryptomoneda(precio);
    }
}

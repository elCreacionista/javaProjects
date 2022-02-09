package MONEDAS;

public class Moneda {
    double precio;
    double total;

    Moneda(double precio){
        this.precio = precio;
        total = 1;
    }
    public void Crearmonedas(int cantidad){
        double cantidadactual = this.total;
        this.total += cantidad;
        double indicesubida = cantidadactual / this.total;
        this.precio *= indicesubida;
    }

    public void Minear(int cantidad){
        this.total+= cantidad;
    }



    public void show(){
        System.out.println("Precio: " + this.precio + " Cantidad: " + this.total);
    }
}

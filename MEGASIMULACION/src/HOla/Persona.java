package HOla;

public class Persona {


    String nombre;
    double altura;
    double peso;
    Persona(String nombre, double altura, double peso){
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }
    public void sayHola(){
        System.out.println("hola soy " + nombre);
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[20];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Persona("P" + (i + 1), i * 10, i * 15);
            p[i].sayHola();
        }
    }

}

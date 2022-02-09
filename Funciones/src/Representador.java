import javax.swing.*;
import java.awt.*;

public class Representador {
    double[] valoresX;
    double[] valoresY;

    JFrame jf = new JFrame();
    Container jp = new Container();
    JLabel[] jl;
    Representador(double[] x, double[] y){
        this.valoresX = x;
        this.valoresY = y;
        this.jl = new JLabel[x.length];
    }
    public void Mostrar(){
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(600,600);
        jf.setVisible(true);
        jp.setBackground(Color.LIGHT_GRAY);
        jf.add(jp);
        setLabels();
    }
    public void setLabels(){
        for (int i = 0; i < this.valoresY.length ; i++) {
            jl[i] = new JLabel();
            jl[i].setBounds((int)valoresX[i] * 10, (int)valoresY[i] * 10,20 ,20);
            jl[i].setOpaque(true);
            jl[i].setBackground(Color.black);
            jf.add(jl[i]);
        }
    }

    public static void main(String[] args) {
        Funcion f = new Funcion();
        f.Representar( new double[]{1,2,4,5});
    }
}

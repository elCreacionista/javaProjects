public class Circle {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);


/*        for (int j = 0; j < 70; j++) {
            t.forward(3);
            t.turnLeft(1);
        }
        t.turnLeft(110);
        for (int j = 0; j < 70; j++) {
            t.forward(3);
            t.turnLeft(1);
        }*/

        t.forward(458/4);
        t.turnLeft(90);
        int angle = 0;
        while (angle < 400){
            int actual = Math.random() < .5 ? 0 : 2 ;
            angle += actual;
            t.forward(1);//(int)(Math.random()*4));
            t.turnLeft(actual);
        }
        t.show();
    }

}

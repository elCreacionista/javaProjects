public class Exercicis {
    public static void main(String[] args) {

        //Cuadrats(5,5,40);
        //Escales(10,200,100);
        //Malla(7,4,10);
        //Arbre(5,50);
        //QuadratsConcentrics(10,50);
        //Flor(15);
        //BaronVermell();
        //Espiral(3,8);
        //MitjaCircunferencia();
        Paraigues(100,9);
        t.show();
    }
    static Turtle t = new Turtle(500,500);


    /*100, 9 == 145, 110*/

    //EXERCICI9
    public static void Paraigues(int costat, int triangles){
        int angle = 360 / triangles;
        System.out.println(angle);
        for (int i = 0; i < triangles; i++) {
            t.forward(costat);
            t.turnLeft(-110);
            t.forward(145);
            t.forward(-145);
            t.turnLeft(110);
            t.turnRight(angle);

        }

    }


    //EXERCICI10
    public static void MitjaCircunferencia(){
        t.forward(230);
        t.turnRight(90);
        for (int i = 0; i < 90; i++) {
            t.forward(2);
            t.turnRight(1);
        }
        t.turnRight(90);
        t.forward(230);
        t.turnLeft(90);
        for (int i = 0; i < 90; i++) {
            t.forward(2);
            t.turnLeft(1);
        }
    }



    //EXERCICI1
    public static void Cuadrats(int files,int columnes, int longitud_costat){
        int distancia = (int) (longitud_costat * 1.3);
        for (int i = 0; i < columnes ; i++) {

            /*Aquest for dibuixa cada columna, amb una distància relativa al costat del cuadrat*/
            for (int j = 0; j < files; j++) {
                Cuadrat(longitud_costat);
                t.penDown = false;
                t.forward(distancia);
                t.penDown = true;
            }
            /*Quan s'ha fet la columna, es canvia de columna, torn enrere al punt de partida,
             desplaç turtle a la esquerra i faig faig la seguent columna*/
            t.penDown = false;
            t.forward(-(distancia * files));
            t.turnLeft(90);
            t.forward(distancia);
            t.penDown = true;
            t.turnLeft(-90);

        }
    }

    //EXERCICI2
    public static void Escales(int escalons, int pverticals, int phoritzontals){

        /*Determin el tamany dels escalons*/
        int altura = (int) (pverticals / escalons);
        int costat = (int) (phoritzontals / escalons);

        /*Aquesta variable serveix per despres girar el sentit de l'escala*/
        int direccio = 90;
        /*Pos l'escala en horitzontal, sense aquest turn l'escala quedava cap a la esquerra*/
        t.turnLeft(90);
        for (int i = 0; i <= escalons * 2; i++) {
            t.turnLeft(-direccio);
            /*Aquest if evita el primer escalo; faig l'escala normal: avança, gira, avança i gira*/
            if (i != 0)
                t.forward(-altura);
            t.turnLeft(direccio);
            t.forward(costat);
            /*Aquest if inverteix el sentit de l'escala*/
            if (i == escalons) {
                t.forward(costat);
                direccio *= -1;
            }
        }

    }

    //EXERCICI3
    public static void Malla(int files,int columnes, int longitud_costat){
        /*Calcul la altura i l'amplada total perque no dibuixare la malla com quadrats separats, fare les linies
         * de adalt a abaix i despres dels costats*/
        int altura = files * longitud_costat;
        int costat = columnes * longitud_costat;
        t.turnLeft(-90);

        /*Com a l'exercici 2 aquesta variable es per canviar el sentit i no ter un rectangle*/
        int constant = 90;
        /*Aquest for fa dues iteracións més, perque 1 cuadrat té quatre costats, i així es completen els cuatre*/
        for (int i = -1; i < files + columnes + 1; i++) {
            /*Aquest if gira el sentit de les linies*/
            if (i == files)
                t.turnLeft(-90);
            /*Primer faig les files, de costat a costat i quan ja les ha fetes fa les columnes*/
            if (i < files)
                t.forward(costat);
            else
                t.forward(altura);
            /*Aquesta part es mou entre les linies,
             * L'if fa que no es faci un avanç de mes*/
            t.penDown = false;
            t.turnLeft(constant);
            if (i != files - 1)
                t.forward(longitud_costat);
            t.turnLeft(constant);
            t.penDown = true;
            /*Inverteix la constant perque la seguent iteració es farà en direcció contrària*/
            constant *= -1;
        }
    }

    //EXERCICI4 /*COMENTAR*/
    public static void Arbre(int fulles, int longitud){
        int hipotenusa = (int)Math.sqrt((longitud*longitud) + (longitud*longitud));
        t.forward(hipotenusa);
        for (int i = 0; i < fulles; i++) {
            t.turnLeft(90);
            t.forward(longitud);
            t.turnLeft(-135);
            t.forward(hipotenusa);
            if (i == fulles - 1)
                t.forward(longitud/fulles);
            else
                t.turnLeft(45);
        }
        t.turnRight(90);
        t.forward(longitud/fulles);
        for (int i = 0; i < fulles; i++) {
            t.forward(hipotenusa);
            t.turnLeft(-135);
            t.forward(longitud);
            t.turnLeft(90);
            if (i == fulles - 1)
                t.forward(hipotenusa);
            else
                t.turnLeft(45);
        }

    }

    //EXERCICI5
    public static void QuadratsConcentrics(int cuantitat, int tamanyprimer){
        /*Aquest es la distància a la cual estaran els quadrats*/
        int diferencia = tamanyprimer/5;
        /*Aixo es el tamany del cuadrat actual*/
        int actual = tamanyprimer + diferencia;
        for (int i = 0; i < cuantitat; i++) {
            /*Dibuixa el cuadrat*/
            Cuadrat(actual);
            /*Es desplaça el punt a on ha de començar el seguent quadrat*/
            t.penDown = false;
            t.turnRight(90);
            t.forward(diferencia);
            t.turnRight(90);
            t.forward(diferencia);
            t.turnLeft(180);
            t.penDown = true;
            /*Augmenta el tamany del cuadrat, l'espai que ens hem botat el sum aqui*/
            actual += diferencia * 2;

        }

    }

    //EXERCICI6
    public static void Espiral(int voltes, int costats){
        /*angle defineix quin angle ha de tenir el poligon demanat*/
        int angle = 360 / costats;
        /*Tamany es orientatiu, he posat 50, per defecte */
        int tamany = 50;
        /*El primer bucle fa tota la espiral*/
        for (int i = 0; i < voltes; i++) {
            /*En cada un d'aquest bucle es fa el polígon */
            for (int j = 0; j < costats; j++) {
                t.forward(tamany);
                t.turnLeft(-angle);
                /*Cada 180º mes o menys augment el tamany del costat perque no intersectin els poligons*/
                if (j == (costats/2) - 1)
                    tamany += 20;
            }
            tamany += 20;

        }
    }

    //EXERCICI7
    public static void Flor(int petals){
        /*Calcul el que ha de girar l'angle en relació a la circunferència completa*/
        int angle = 360 / petals;
        System.out.println(angle);
        for (int i = 0; i < petals; i++) {

            /*Faig la meitat de la fulla*/
            for (int j = 0; j < 70; j++) {
                t.forward(3);
                t.turnLeft(1);
            }
            /*Gir 110 graus per tornar al centre*/
            t.turnLeft(110);
            /*Faig el mateix però en la direcció oposada*/
            for (int j = 0; j < 70; j++) {
                t.forward(3);
                t.turnLeft(1);
            }
            /*Al acabar la fulla l'angle no està en 'forma' inicial, per aixìò sum els 110º que li falten*/
            t.turnLeft(angle + 110);

        }
    }

    //EXERCICI8
    public static void BaronVermell(){
        /* Suposant que son triangles equilaters, els seus angles son 180/3
        i la seva inclinació es de 360/4 amb una punta en el centre*/

        /*Inclin el dibuix mig triangle cap un costat perque quedi com al exercici*/
        t.turnLeft((180-(180/3)) / 2);
        for (int i = 0; i < 4; i++) {
            /*Faig un triangle de 70px*/
            for (int j = 0; j < 3; j++) {
                t.forward(70);
                t.turnLeft(180-(180/3));
            }
            /*Gir 90 graus per fer el seguent triangle*/
            t.turnLeft(360/4);
        }
    }

    //AJUDES
    public static void Cuadrat(int costat){
        for (int i = 0; i < 4; i++) {
            t.forward(costat);
            t.turnLeft(90);
        }
    }

}

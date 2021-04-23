package sample.model;

import java.util.Random;

//Class Dado

public class Dado {
    //Atributo

    private int face;

    //Construturo inicializando com zero no valor da face

    public Dado(){
        face = 0;
    }

    //Lançar dado e gerar número randomicamente

    public void lancar(){
        Random random = new Random();
        //random = 7 => 0,1,2,3,4,5,6
        while (face == 0) face = random.nextInt(7);
    }

    //Pegar o valor da face
    public int getFace(){
        return face;
    }

    //Imprimir

    public String toString(){
        return String.valueOf(this.face);
    }
}
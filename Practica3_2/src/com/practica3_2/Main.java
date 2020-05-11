package com.practica3_2;

/*Utiliza Clases, arreglos , para cambiar de lugar un switch

        Imagina hay 4 microorganismos que están un cuerpo humano, donde estos humanos tienen los órganos básicos: cerebro, corazón, pulmones , hígado, estomago, boca, intestinos, estos órganos son los lugares donde los microorganismos van a moverse.
        Los 4 microorganismos empezaran en la boca y cada iteración de el ciclo del programa , eligirán un lugar aleatorio a donde moverse individualmente.
        Los microorganismos tendrán 256 vidas, cada vez que se muevan por el hígado, su vida se reduce a la mitad ( no uses operaciones aritméticas).

        El programa se acaba cuando todos 4 microorganismos tengan su vida en cero.
*/


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        microorganismo[] virus= new microorganismo[4];

        for(int i =0 ; i<4 ; i++){
            virus[i] = new microorganismo();
            virus[i].move(i+1);
        }
    }
}

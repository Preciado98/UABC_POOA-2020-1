package com.practica3_2;

import java.util.Random;

public class microorganismo extends humano{
        int vida;
        int local;
        int numO;
        String estado;
        Random random = new Random();

    public microorganismo() {
        this.vida = 256;
        this .estado = "con vida";
    }

    public void moveorg(int numO){
        switch (numO){
            case 3:
                this.vida=this.vida>>1;
                System.out.println("El microorganismo "+numO+ " paso por " + humano[numO] + " con "+vida+" y esta "+estado);
                break;
            default:
                System.out.println("El microorganismo "+numO+ " paso por " + humano[numO] + " con "+vida+" y esta "+estado);
                break;
        }
    }

    public void move(int numO){

        System.out.println("El microorganismo "+numO+ " paso por " + humano[numO] + " con "+vida+" y esta "+estado);

        while(vida>0) {
            local = random.nextInt(7);

            if (local == higado) {
                vida = vida >> 1;
            }

            if(vida <= 0){
                estado = "Muerto";
            }

            System.out.println("El microorganismo "+numO+ " paso por " + humano[numO] + " con "+vida+" y esta "+estado);
        }
    }
}

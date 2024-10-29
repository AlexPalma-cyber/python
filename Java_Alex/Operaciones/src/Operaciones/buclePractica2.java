package Operaciones;

public class buclePractica2 {
    public static void main(String[] args) {
        int inicio, limite;
        limite = 10;

        for(inicio = 0; inicio < limite; inicio++) {
            System.out.println("Imprimo un " + inicio);
        }

        int cat1, cat2, hip;

        System.out.println("-> c² = a² + b² ");
        for (hip = 1; hip <= 1000; hip++) {//hipotenusa
            for (cat1 = 1; cat1 < 1000; cat1++) { //el primer cateto
                for (cat2 = 1; cat2 < 1000; cat2++) {//el segundo cateto
                    //condicional
                    if (hip == Math.sqrt(cat1*cat1+cat2*cat2)) {
                        System.out.println("a. " + hip + "² = " + cat1 + "² + " + cat2 + "²");
                    }
                }
            }
        }
    }
}

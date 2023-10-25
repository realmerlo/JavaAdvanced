package Exceptions4;

import java.util.Arrays;
import java.util.Random;

public class Exceptions4 {
    public static void main(String[] args) {
        int[] array = new int[7];
        fillArray(array);
        System.out.println(Arrays.toString(array));

        try {
            System.out.println(dividerArray(array, -5, 4));
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }

    public static void fillArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
        }
    }

    public static int dividerArray(int[] array, int index, int num) {
        if (array.length < index) {
            throw new ArrayIndexOutOfBoundsException("Error: index maggiore della lunghezza dell'array");
        } else if (num == 0) {
            throw new ArithmeticException("Error: diviso per 0");
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Error: index negativo coglione");
        } else {
            return array[index] / num;
        }
    }
}
//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
//e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.
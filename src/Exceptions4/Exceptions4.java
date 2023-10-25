package Exceptions4;

import java.util.Arrays;
import java.util.Random;

public class Exceptions4 {
    public static void main(String[] args) {
        int[] array = new int[7];
        fillArray(array);
        System.out.println(Arrays.toString(array));

        try {
            System.out.println(dividerArray(array,4));
        }
        catch (ArithmeticException e){
            System.out.println("Error: the number cant be divided for 0 " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the position isn't in the array " + e);
        }

    }
    public static void fillArray (int[] array){
        Random r = new Random();
        for(int i = 0; i < array.length;i++){
            array[i] = r.nextInt(20);
        }
    }
    public static int dividerArray (int[] array, int index) throws ArithmeticException{
       int output = array[index] / 0;
       int count = 0;
       for(int i = 0; i < array.length; i++){
           count ++;
           if(count > index){
               throw new ArrayIndexOutOfBoundsException();
           }
       }
       return output;
    }
}
//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
//e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.
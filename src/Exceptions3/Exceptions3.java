package Exceptions3;

public class Exceptions3 {
    public static void main(String[] args) {
        try {
            System.out.println(divider(10, 0));
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static int divider (int num, int div){
       if(div != 0){
           return num / 0;
       } else {
           throw new ArithmeticException("Error: the number cant be divided for 0 ");
       }
    }
}
//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

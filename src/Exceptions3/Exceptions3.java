package Exceptions3;

public class Exceptions3 {
    public static void main(String[] args) {
        try {
            System.out.println(divider(10));
        }
        catch (Exception e){
            System.out.println("Error: the number cant be divided for 0 " + e);
        }

    }
    public static int divider (int num) throws ArithmeticException {
        int output = num / 0;
        return output;
    }
}
//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

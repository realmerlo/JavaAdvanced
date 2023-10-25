package Autoboxing_unboxing;

public class Autoboxing {
    public static void main(String[] args) {
        int intero = 2;
        double doppio = 4.55;
        char carattere = 'L';
        Integer intero2 = intero;
        Double doppio2 = doppio;
        Character carattere2 = carattere;

        Integer interoI = 7;
        Double doppioD = 8.78;
        Character carattereC = 'S';
        int interoI2 = interoI;
        double doppioD2 = doppioD;
        char carattereC2 = carattereC;

        System.out.println(sum(intero, interoI2));
        printChar(carattereC2);
        System.out.println(sumI(intero2, interoI));
        printC(carattere2);
    }

    public static int sum(int val1, int val2) {
        return val1 + val2;
    }public static void printChar(char x) {
        System.out.println(x);
    }public static int sumI(Integer val1, Integer val2) {
        return val1 + val2;
    }public static void printC(Character x) {
        System.out.println(x);
    }
}
//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati

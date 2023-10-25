package Hashet1;

import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hashset1 {
    public static void main(String[] args) {
    HashSet<Integer> lucaSavini = new HashSet<Integer>();
        fillHash(lucaSavini);
        System.out.println(lucaSavini);
        System.out.println(lucaSavini.size());
        printElement(lucaSavini);
    }
    public static HashSet fillHash (HashSet<Integer> toFill){
        toFill.addAll(Arrays.asList(1, 2, 3, 4, 5));
        return toFill;
    }
    public static void printElement (HashSet<Integer> toPrint){
        for(int element : toPrint){
            System.out.println("element is " + element);
        }
    }
}
//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

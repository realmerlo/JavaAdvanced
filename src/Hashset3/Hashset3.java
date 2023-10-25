package Hashset3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<Integer> lucaSavini = new HashSet<Integer>();
        fillHash(lucaSavini);
        System.out.println(lucaSavini);
        System.out.println(lucaSavini.size());
        printElement(lucaSavini);
        Integer lucaTheEmperor = 9;
        System.out.println(isPresent(lucaSavini, lucaTheEmperor));
        System.out.println(removeElement(lucaSavini,4));
        System.out.println(clearHash(lucaSavini));


    }

    public static boolean isPresent (HashSet<Integer> list, Integer element){
        if(list.contains(element)){
            return true;
        }
        System.out.println("l'elemento è presente: ");
        return false;
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
    public static HashSet removeElement (HashSet<Integer> list, Integer toRemove){
        Iterator<Integer> iteretor = list.iterator();
        while (iteretor.hasNext()){
           Integer element = iteretor.next();
           if(element == toRemove){
               iteretor.remove();
            }
        }
        return list;
    }
    public static HashSet clearHash (HashSet<Integer> list){
        list.clear();
        if(list.isEmpty()){
            System.out.println("l'Hashset è vuoto");
        } else {
            System.out.println("l'Hashset non è vuoto");
        }
        return list;
    }
}
//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
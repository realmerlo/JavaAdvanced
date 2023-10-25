package Exceptions2;

public class Exceptions2 {
    public static void main(String[] args) {
        try {
            System.out.println(controlChar('t'));
        }
        catch (Exception e){
            System.out.println("Error: the char isn't a number " + e);
        }

    }
    public static boolean controlChar (char c) throws Exception{
        if(Character.isDigit(c)){
            return true;
        } else throw new Exception();
    }
}
//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.

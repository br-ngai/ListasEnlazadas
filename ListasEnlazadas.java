
package com.mycompany.listasenlazadas;

import java.util.*;


public class ListasEnlazadas {
    public static void main(String args[]) {
        
        LinkedList <NumCel> agenda = new LinkedList  <NumCel>();
        agenda.add(new NumCel("Ariel", "5533431498"));
        agenda.add(new NumCel("Juanchisco", "5533913278"));
        agenda.add(new NumCel("Leonardo", "5517558769"));
        agenda.add(new NumCel("Julia", "5611856987"));
        agenda.add(new NumCel("Brenda","5599663598"));
        agenda.add(new NumCel("Brandon", "5511842598"));
        

        Iterator<NumCel> recorrido = agenda.iterator();
        NumCel et;
        System.out.println("Muestra la lista en "+ "dirección normal:");
        while (recorrido.hasNext()) {
            et = recorrido.next();
            System.out.println(et.nombre + ": " + et.numero);
        }
        System.out.println();
        
        ListIterator<NumCel> litr
                = agenda.listIterator(agenda.size());
        System.out.println("Muestra la lista en "+ "dirección inversa:");
        while (litr.hasPrevious()) {
            et = litr.previous();
            System.out.println(et.nombre + ": " + et.numero);
        }
    }
}
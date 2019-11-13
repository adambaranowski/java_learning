package main;

//kolekcje

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collection;

public class Lekcja03 {
    public static void main(String args[]){
        // Araylist - szybkie odczytywanie obietków
        // linked list - umieszczanie obiektów
        List<Integer> listaInt = new ArrayList<>();
        List<String> listaStr = new ArrayList<>();

        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");

        for (String s : listaStr){
            System.out.println(s);
        }

        listaStr.add(0, "zero");

        for(int i = 0; i<listaStr.size(); i++){
            System.out.println(listaStr.get(i));
        }
        //listaStr.remove(listaStr.indexOf("dwa")); prostackie
        listaStr.remove("dwa"); //remove object
        for(String s : listaStr){
            System.out.println(s);
        }

        listaStr.removeAll(listaStr); //czysci liste z danej kolekcji

        //mapa jak słownik w pytonie

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "jedynka");
        mapa.put(2, "dwojka");


        for(Map.Entry<Integer, String> m : mapa.entrySet()){
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key + " " + value);
        }

        System.out.println(mapa.containsKey(1));


    }
}

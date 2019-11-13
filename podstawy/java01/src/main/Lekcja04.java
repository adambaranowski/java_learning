package main;

import java.util.*;

public class Lekcja04 {
    public static void main(String args[]){

        Set<String> setStr = new HashSet<>();

        setStr.add("jeden");
        setStr.add("dwa");
        setStr.add("trzy");
        setStr.add("jeden");//dodajemy ale jest tylko jedno wystąpienie

        for(String s: setStr){
            System.out.println(s);
        }

        Random r = new Random();
        Set<Integer> nums = new HashSet<>();

        while(nums.size()<7){
            int x = r.nextInt(36) + 1; // bo losuje od zera
            System.out.println("wylosowano: " + x);
            nums.add(x);
        }

        for(Integer i : nums){
            System.out.println(i);
        }

        //zbior na liste
        List<Integer> intList = new ArrayList<>();
        intList.addAll(nums);

        for(Integer x : intList){
            System.out.print(x + " ");
        }


    }
}

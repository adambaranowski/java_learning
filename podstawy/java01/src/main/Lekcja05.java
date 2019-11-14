package main;

import java.util.*;
import java.lang.*;



public class Lekcja05 {
    public static void main(String args[]){

        int x = 9;
        if(x == 1){
            System.out.println(x);
        }else if(x == 6){
            System.out.println(x);
        }else{
            System.out.println("nic");
        }

        switch(x){
            case 4:
                showNumber(x);
                break;
            case 6:
                showNumber(x);
                break;
            default:
                System.out.println("nie ma oczekiwanej wart");
        }

        String imie = "jan";
        if(imie.equals("jan")){
            System.out.println("cześć" + imie);
        }
        

    }


    public static void showNumber(int x){
        System.out.println("x = " + x);
    }



}

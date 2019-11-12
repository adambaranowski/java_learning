package main;

public class Lekcja02 {

    public static void main(String args[]){

        int tab01[] = new int[5];
        for(int i = 1; i<6; i++) {
            tab01[i-1] = i;
        }

        for(int i = 1; i<6; i++) {
            System.out.println(tab01[i-1]);
        }

        int tab02[] = {6, 7, 8, 9, 10};
        for(int i = 1; i<6; i++) {
            System.out.println(tab02[i-1]);
        }
    }




}

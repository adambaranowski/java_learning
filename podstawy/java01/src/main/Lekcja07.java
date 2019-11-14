package main;

import java.util.Scanner;

public class Lekcja07 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("wpisz cos");
        str = sc.nextLine();
        System.out.println("wpisałes " + str);
        try {
            long x = Long.parseLong(str);
            //int x = Integer.parseInt(str);
            System.out.println(x * x);
        }catch (Exception e){
            System.out.println("niepoprawna liczb");
            main(null);
        }
        System.out.println("podaj liczbe");
        int liczba = sc.nextInt();
        String str2 = String.valueOf(liczba);
    }
}

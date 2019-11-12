package main;

public class Lekcja01 {
    public static void main(String args[]){
        int x = 1;
        String str = "xyz";

        char c = 'x';
        char d = 'y';

        String a  = String.valueOf(c) + String.valueOf(d);
        String liczba = "123";
        int num = Integer.parseInt(liczba);
        double num2 = num;
        num2 = Math.pow(num2, 2);

        System.out.println(a);
        System.out.println(num2);
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);



    }
}

package main;

public class Lekcja08 {
    public static void main(String args[]){
        Lekcja08 l = new Lekcja08();
        l.metoda01();
        l.metoda01("puciak");
    }

    public void metoda01() {
        System.out.println("testmetody");
    }
    public void metoda01(String s) {
        System.out.println("testmetody" + s);
    }
}

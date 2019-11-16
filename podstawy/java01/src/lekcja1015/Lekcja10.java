package lekcja1015;


public class Lekcja10 {

    public static void main(String args[]){
        Raporty r = new Raporty();
        System.out.println(r.rapWygenerowanyPrzez("andrzej"));
        r.tytul = "rap01";
        r.pokaz(r.tytul);
        r.drukuj(r.tytul);

        r.generujRaport(r.tytul);


    }




}


package lekcja1015;

public class Raporty extends Raport implements raportyinterfejs{
    String tytul;
    public void pokaz(String str){
        System.out.println(("Raport " + str + " wyswietlany na ekranie"));
    }

    public  void drukuj(String str){
        System.out.println("Drukowanie raportu " + str);
    }

    @Override
    public void generujRaport(String str){
        System.out.println("Przygotowanie Raportu " + str);
    }

}

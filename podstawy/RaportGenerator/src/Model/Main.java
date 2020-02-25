package Model;

import java.util.List;

public class Main {
    public static void main(String[] args){
        EventsGenerator e = new EventsGenerator();
        List<String> testy = e.getAllRegularMass("maj", 40);

        for (String s: testy
             ) {
            System.out.println(s);

        }

    }
}

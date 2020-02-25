package Model;

import java.util.*;

public class EventsGenerator implements Events{

    private List<String> events = new ArrayList<>();

    public void addEvents(List<String> event){
       events.addAll(event);
    }

    public void removeEvents(List<String> event){
        events.removeAll(event);
    }

    public List<String> getAllRegularMass(String month, int price){

        String months[] = {"Styczeń", "Luty", "Marzec", "Kwiecień",
                "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik",
                "Listopad", "Grudzień"};
        String regularText="Niedziela 5 Mszy";

        List<String> masses = new ArrayList<>();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();


        masses.add(months[gregorianCalendar.get(Calendar.MONTH)]+" "+gregorianCalendar.get(Calendar.YEAR)+" "+regularText+" #" + String.valueOf(price*5));


        return masses;




    }





}

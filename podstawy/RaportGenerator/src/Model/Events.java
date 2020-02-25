package Model;

import java.util.List;

public interface Events {
    void addEvents(List<String> events);
    void removeEvents(List<String> events);
    List<String> getAllRegularMass(String month, int price);

}

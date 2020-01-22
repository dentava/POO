package app;

import java.util.ArrayList;
import java.util.List;

public class AppLogistic {

    List<Path> paths; //All the travels
    List<Transport> transports; //All the company transports
    List<Travel> travels;

    public AppLogistic(){
        paths = new ArrayList<>();
        transports = new ArrayList<>();
        travels = new ArrayList<>();
    }

    public void addTransport(String type, double quantity) {
    }

    public void addPath(List<String> locations) {
    }

    public void addTravel(String departure, String destination, double quantity, String type) {
    }

    public String printTravels() {
        return null;
    }
}

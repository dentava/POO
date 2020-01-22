package app;

import java.util.ArrayList;

public class Travel {

    Path path;
    ArrayList<Transport> transportsInvolved; //Transports involved in this travel
    double quantity; //KG
    String type;

    Travel(String departure, String destination, double quantity, String type){
        this.quantity = quantity;
        this.type = type;

        path = findCompatiblePath(departure, destination);
        transportsInvolved = new ArrayList<>();
        transportsInvolved = findCompatibleListOfTransports();
    }

    private ArrayList<Transport> findCompatibleListOfTransports() {
        //TODO
        return transportsInvolved;
    }

    private Path findCompatiblePath(String departure, String destination) {
        //TODO
        return path;
    }

}

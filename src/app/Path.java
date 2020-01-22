package app;

import java.util.ArrayList;

public class Path {

    ArrayList<String> path;

    Path(ArrayList<String> path){
        path = new ArrayList<>();
        this.path = path;
    }

    Path(){
        path = new ArrayList<>();
    }

    String getDeparture(){
        return path.get(0);
    }

    String getDestination(){
        return path.get(path.size()-1);
    }
}

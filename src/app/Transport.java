package app;

public class Transport {

    String type;
    double capacity;

    Transport(String type, double capacity){
        this.type = type;
        this.capacity = capacity;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    double getCapacity() {
        return capacity;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

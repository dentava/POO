import app.AppLogistic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AppLogistic app = new AppLogistic();

        app.addTransport("Colli Sfusi", 50);
        app.addTransport("Da Frigo", 80);
        app.addTransport("Colli Sfusi", 100);

        app.addPath(List.of("Udine", "Pordenone"));
        app.addPath(List.of("Udine", "Codroipo", "Pordenone"));
        app.addPath(List.of("Udine", "Trieste"));
        app.addPath(List.of("Udine", "Gorizia", "Trieste"));
        app.addPath(List.of("Udine", "Palmanova", "Gorizia", "Trieste"));

        app.addTravel("Udine", "Codroipo", 40, "Colli Sfusi");
        app.addTravel("Udine", "Trieste", 120, "Colli Sfusi");
        app.addTravel("Palmanova", "Gorizia", 60, "Da Frigo");
        app.addTravel("Udine", "Gorizia", 60, "Colli Sfusi");

        System.out.println(app.printTravels());
    }
}

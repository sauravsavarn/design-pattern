package in.designpattern.behavioural.chainofresponsibility.eg1;

public class MainCOR {
    public static void main(String[] args) {
        Request request = new Request("RAIL", "request for the defence ministry");

        DefenceMinistryHandler defenceMinistryHandler = new DefenceMinistryHandler();
        HomeMinistryHandler homeMinistryHandler = new HomeMinistryHandler();
        RailMinistryHandler railMinistryHandler = new RailMinistryHandler();

        homeMinistryHandler.handleRequest(request);
        homeMinistryHandler.setNextHandler(railMinistryHandler);
        railMinistryHandler.handleRequest(request);
        railMinistryHandler.setNextHandler(defenceMinistryHandler);
        defenceMinistryHandler.handleRequest(request);
        defenceMinistryHandler.setNextHandler(null);

    }
}

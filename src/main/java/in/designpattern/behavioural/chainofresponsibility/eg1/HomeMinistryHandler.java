package in.designpattern.behavioural.chainofresponsibility.eg1;

public class HomeMinistryHandler implements Handler {
    Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.reqId().startsWith("HOME")) {
            System.out.println("Request handled by Home Ministry");
        }  else if(nextHandler != null) nextHandler.handleRequest(request);
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

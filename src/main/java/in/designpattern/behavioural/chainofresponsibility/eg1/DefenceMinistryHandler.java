package in.designpattern.behavioural.chainofresponsibility.eg1;

public class DefenceMinistryHandler implements Handler{
    Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.reqId().startsWith("DEF")) {
            System.out.println("Request handled by Defence Ministry");
        } else if(nextHandler != null) nextHandler.handleRequest(request);
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

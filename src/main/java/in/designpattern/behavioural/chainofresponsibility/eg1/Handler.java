package in.designpattern.behavioural.chainofresponsibility.eg1;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler handler);
}

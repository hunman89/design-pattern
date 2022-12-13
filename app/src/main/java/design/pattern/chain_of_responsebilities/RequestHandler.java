package design.pattern.chain_of_responsebilities;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public void handle(Request request) {
        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }
    
}

package design.pattern.chain_of_responsebilities;

public class LoggingRequestHandler extends RequestHandler{

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void handle(Request request) {
        // TODO Auto-generated method stub
        System.out.println("로깅");
        super.handle(request);
    }
    
}

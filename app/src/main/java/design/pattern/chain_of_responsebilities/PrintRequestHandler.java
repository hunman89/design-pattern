package design.pattern.chain_of_responsebilities;

public class PrintRequestHandler extends RequestHandler{

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void handle(Request request) {
        // TODO Auto-generated method stub
        System.out.println(request.getBody());
        super.handle(request);
    }

    
    
}

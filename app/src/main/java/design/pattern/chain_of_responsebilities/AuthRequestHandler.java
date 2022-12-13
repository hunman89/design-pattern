package design.pattern.chain_of_responsebilities;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void handle(Request request) {
        // TODO Auto-generated method stub
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }

    
    
}

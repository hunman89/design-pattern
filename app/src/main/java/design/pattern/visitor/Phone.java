package design.pattern.visitor;

public class Phone implements Device {

    @Override
    public void print(Ractangle ractangle) {
        // TODO Auto-generated method stub
        System.out.println("Print Ractangle to Phone");

    }

    @Override
    public void print(Circle circle) {
        // TODO Auto-generated method stub
        System.out.println("Print Circle to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        // TODO Auto-generated method stub
        System.out.println("Print Triangle to Phone");

    }

}

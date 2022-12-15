package design.pattern.visitor;

public class Watch implements Device {

    @Override
    public void print(Ractangle ractangle) {
        // TODO Auto-generated method stub
        System.out.println("Print Ractangle to Watch");

    }

    @Override
    public void print(Circle circle) {
        // TODO Auto-generated method stub
        System.out.println("Print Circle to Watch");

    }

    @Override
    public void print(Triangle triangle) {
        // TODO Auto-generated method stub
        System.out.println("Print Triangle to Watch");

    }

}

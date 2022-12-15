package design.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        Shape ractangle = new Ractangle();
        Device device = new Phone();
        ractangle.accept(device);
    }
}

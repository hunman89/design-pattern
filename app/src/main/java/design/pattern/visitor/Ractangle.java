package design.pattern.visitor;

public class Ractangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);

    }

}

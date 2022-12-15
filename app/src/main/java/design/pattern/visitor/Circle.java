package design.pattern.visitor;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        // TODO Auto-generated method stub
        device.print(this);
    }

}

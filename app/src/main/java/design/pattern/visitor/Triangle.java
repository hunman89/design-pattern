package design.pattern.visitor;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        // TODO Auto-generated method stub
        device.print(this);
    }

}

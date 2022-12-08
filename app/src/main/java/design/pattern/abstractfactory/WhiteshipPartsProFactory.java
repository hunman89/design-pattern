package design.pattern.abstractfactory;

public class WhiteshipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        // TODO Auto-generated method stub
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        // TODO Auto-generated method stub
        return new WhiteWheelPro();
    }

}

package design.pattern.abstractfactory;

/**
 * WhiteshipPartsFactory
 */
public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        // TODO Auto-generated method stub
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        // TODO Auto-generated method stub
        return new WhiteWheel();
    }

}
package design.pattern.factorymethod;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        // TODO Auto-generated method stub
        return new Whiteship();
    }

}

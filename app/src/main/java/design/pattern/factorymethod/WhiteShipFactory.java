package design.pattern.factorymethod;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        // TODO Auto-generated method stub
        return new Whiteship();
    }

}

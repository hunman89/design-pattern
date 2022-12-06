package design.pattern.factorymethod;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        // TODO Auto-generated method stub
        return new Blackship();
    }

}

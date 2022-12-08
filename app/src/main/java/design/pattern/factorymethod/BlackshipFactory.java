package design.pattern.factorymethod;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        // TODO Auto-generated method stub
        return new Blackship();
    }

}

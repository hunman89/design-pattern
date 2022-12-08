package design.pattern.abstractfactory;

import design.pattern.factorymethod.DefaultShipFactory;
import design.pattern.factorymethod.Ship;
import design.pattern.factorymethod.Whiteship;

/**
 * WhiteshipFactory
 */
public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        // TODO Auto-generated method stub
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }

}
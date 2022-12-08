package design.pattern.abstractfactory;

import design.pattern.factorymethod.Ship;
import design.pattern.factorymethod.ShipFactory;
import design.pattern.factorymethod.WhiteShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}

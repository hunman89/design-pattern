package design.pattern.abstractfactory;

public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}

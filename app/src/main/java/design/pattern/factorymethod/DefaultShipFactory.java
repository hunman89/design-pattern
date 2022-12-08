package design.pattern.factorymethod;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        // TODO Auto-generated method stub
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}

package design.pattern.factorymethod;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    };

    Ship createShip();

    private void validate(String name, String mail) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (mail == null || mail.isEmpty()) {
            throw new IllegalArgumentException("연락처를 남겨 주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}

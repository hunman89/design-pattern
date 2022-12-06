package design.pattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "hunman@email.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "hunman@mail.com");
        System.out.println(blackship);
    }
}

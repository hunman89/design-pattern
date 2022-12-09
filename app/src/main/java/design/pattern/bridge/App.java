package design.pattern.bridge;

public class App {
    public static void main(String[] args) {
        Champion kdaAhri = new Ahri(new KDA());
        kdaAhri.skillE();
        kdaAhri.skillW();

        Champion poolPartyZed = new Zed(new PoolParty());
        poolPartyZed.move();
        poolPartyZed.skillR();
    }
}

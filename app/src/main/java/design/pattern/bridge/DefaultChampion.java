package design.pattern.bridge;

public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s Q\n", skin.getName(), this.name);

    }

    @Override
    public void skillW() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s W\n", skin.getName(), this.name);

    }

    @Override
    public void skillE() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s E\n", skin.getName(), this.name);

    }

    @Override
    public void skillR() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s R\n", skin.getName(), this.name);

    }

}

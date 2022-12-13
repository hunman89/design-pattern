package design.pattern.command;

public class GameStartCommand implements Command{
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        game.start();
    }
}

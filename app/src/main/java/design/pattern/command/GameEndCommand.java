package design.pattern.command;

public class GameEndCommand implements Command{
    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        game.end();
    }
    
}

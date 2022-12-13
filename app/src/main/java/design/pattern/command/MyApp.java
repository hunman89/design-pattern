package design.pattern.command;

public class MyApp {
    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void go() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.go();
        myApp.go();
    }
}

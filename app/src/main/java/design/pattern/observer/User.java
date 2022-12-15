package design.pattern.observer;

public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleMessage(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

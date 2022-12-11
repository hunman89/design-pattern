package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }

    public List<Component> getComponents() {
        return components;
    }
}

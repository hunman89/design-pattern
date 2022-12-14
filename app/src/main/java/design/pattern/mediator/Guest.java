package design.pattern.mediator;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int numberOfTowels) {
        this.frontDesk.getTowels(this, numberOfTowels);
    }

    public void eatDinner(LocalDateTime dateTime) {
        this.frontDesk.eatDinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

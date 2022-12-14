package design.pattern.mediator;

import java.time.LocalDateTime;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(Integer guestId, int numberOfTowels) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowels + " to " + roomNumber);
    }

    public void setDinner(Integer id, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumberFor(id);
        System.out.println("reservation dinner to " + dateTime + " at " + dateTime);
    }

    
}

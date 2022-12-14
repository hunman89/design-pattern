package design.pattern.mediator;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService;

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "111";
    }

    public void eatDinner(Guest guest, LocalDateTime dateTime) {
        cleaningService.setDinner(guest.getId(), dateTime);
    }
    
}

package Hotel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private String primaryCustomer;
    private String guest;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isCheckedIn;
    private boolean isCheckedOut;
    private List<Service> services;

    private static final LocalTime CHECK_IN_TIME = LocalTime.of(15, 0); // 3 PM
    private static final LocalTime CHECK_OUT_TIME = LocalTime.of(12, 0); // 12 Noon

    public Booking(Room room, String primaryCustomer, String guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.primaryCustomer = primaryCustomer;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.isCheckedIn = false;
        this.isCheckedOut = false;
        this.services = new ArrayList<>();
    }

    public Room getRoom() {
        return room;
    }

    public String getPrimaryCustomer() {
        return primaryCustomer;
    }

    public String getGuest() {
        return guest;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public boolean canCheckIn(LocalTime currentTime) {
        return currentTime.isAfter(CHECK_IN_TIME);
    }

    public boolean canCheckOut(LocalTime currentTime) {
        return currentTime.isBefore(CHECK_OUT_TIME);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public double calculateTotalCost() {
        double totalCost = room.getRate() * (checkOutDate.toEpochDay() - checkInDate.toEpochDay());
        for (Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public List<Service> getServices() {
        return services;
    }
}

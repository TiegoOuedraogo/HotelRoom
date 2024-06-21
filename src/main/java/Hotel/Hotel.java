package Hotel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isBooked() && room.isClean()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Booking bookRoom(String roomType, String primaryCustomer, String guest, LocalDate checkInDate, LocalDate checkOutDate) {
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType) && !room.isBooked() && room.isClean()) {
                Booking booking = new Booking(room, primaryCustomer, guest, checkInDate, checkOutDate);
                room.setBooked(true);
                bookings.add(booking);
                return booking;
            }
        }
        return null;
    }

    public boolean checkIn(Booking booking, LocalTime currentTime) {
        if (booking.canCheckIn(currentTime)) {
            booking.setCheckedIn(true);
            return true;
        }
        return false;
    }

    public boolean checkOut(Booking booking, LocalTime currentTime) {
        if (booking.canCheckOut(currentTime)) {
            booking.setCheckedOut(true);
            booking.getRoom().setBooked(false);
            booking.getRoom().setClean(false);
            return true;
        }
        return false;
    }

    public void cleanRoom(Room room) {
        room.setClean(true);
    }

    public void addServiceToBooking(Booking booking, Service service) {
        booking.addService(service);
    }

    public double calculateTotalBill(Booking booking) {
        return booking.calculateTotalCost();
    }
}

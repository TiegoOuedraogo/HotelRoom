package Hotel;
import java.time.LocalDate;
import java.time.LocalTime;
public class Menu {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Luxury Hotel");
        hotel.addRoom(new DoubleStandardRoom(150));
        hotel.addRoom(new DeluxeDoubleRoom(200));
        hotel.addRoom(new JuniorSuite(300));
        hotel.addRoom(new GrandSuite(400));

        System.out.println("Available Rooms:");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.println(room.getRoomType() + " - £" + room.getRate());
        }

        Booking booking = hotel.bookRoom("Double Standard", "John Doe", "Jane Doe", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 5));
        if (booking != null) {
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Failed to book room.");
        }

        System.out.println("Available Rooms after booking:");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.println(room.getRoomType() + " - £" + room.getRate());
        }

        LocalTime checkInTime = LocalTime.of(16, 0); // 4 PM
        if (hotel.checkIn(booking, checkInTime)) {
            System.out.println("Checked in successfully at " + checkInTime);
        } else {
            System.out.println("Failed to check in at " + checkInTime);
        }

        // Add services to the booking
        hotel.addServiceToBooking(booking, new Service("Breakfast", 10, 4)); // 4 days of breakfast
        hotel.addServiceToBooking(booking, new Service("Room Service", 20, 2)); // 2 room services
        hotel.addServiceToBooking(booking, new Service("Laundry Service", 5, 3)); // 3 laundry items

        System.out.println("Total cost for the booking: £" + hotel.calculateTotalBill(booking));

        LocalTime checkOutTime = LocalTime.of(11, 0); // 11 AM
        if (hotel.checkOut(booking, checkOutTime)) {
            System.out.println("Checked out successfully at " + checkOutTime);
        } else {
            System.out.println("Failed to check out at " + checkOutTime);
        }

        hotel.cleanRoom(booking.getRoom());
        System.out.println("Room cleaned: " + booking.getRoom().getRoomType());
    }
}

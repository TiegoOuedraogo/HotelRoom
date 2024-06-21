package Hotel;

public class DeluxeDoubleRoom extends Room {
    public DeluxeDoubleRoom(double rate) {
        super("Deluxe Double", rate);
    }
    @Override
    public String getRoomType() {
        return "DeluxeDoubleRoom";
    }
    @Override
    public int getMaxGuests() {
        return 2;
    }
    @Override
    public String toString() {
        return "DeluxeDoubleRoom{" +
                "roomType='" + getRoomType() + '\'' +
                ", rate=" + getRate() +
                '}';
    }
}


package Hotel;

public abstract class Room {
    private String roomType;
    private double rate;
    private boolean isClean;
    private boolean isBooked;

    public Room(String roomType, double rate) {
        this.roomType = roomType;
        this.rate = rate;
        this.isClean = true;
        this.isBooked = false;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public abstract int getMaxGuests();

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", rate=" + rate +
                ", isClean=" + isClean +
                ", isBooked=" + isBooked +
                '}';
    }
}

package Hotel;

public class DoubleStandardRoom extends Room{
    public DoubleStandardRoom(double rate) {
        super("Double Standard", rate);
    }
    @Override
    public int getMaxGuests() {
        return 2;
    }
    @Override
    public String getRoomType() {
        return "DoubleStandardRoom";
    }
    @Override
    public String toString() {
        return "DoubleStandardRoom{" +
                "roomType='" + getRoomType() + '\'' +
                ", rate=" + getRate() +
                '}';
    }
}

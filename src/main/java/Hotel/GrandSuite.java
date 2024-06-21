package Hotel;

public class GrandSuite extends Room {
    public GrandSuite(double rate) {
        super("Grand Suite", rate);
    }
    @Override
    public int getMaxGuests() {
        return 2;
    }
    @Override
    public String getRoomType() {
        return "GrandSuite";
    }
    @Override
    public String toString() {
        return "GrandSuite{" +
                "roomType='" + getRoomType() + '\'' +
                ", rate=" + getRate() +
                '}';
    }
}

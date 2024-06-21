package Hotel;
public class JuniorSuite extends Room {
    public JuniorSuite(double rate) {
        super("Junior Suite", rate);
    }
    @Override
    public int getMaxGuests() {
        return 2;
    }
    @Override
    public String getRoomType() {
        return "JuniorSuite";
    }
    @Override
    public String toString() {
        return "JuniorSuite{" +
                "roomType='" + getRoomType() + '\'' +
                ", rate=" + getRate() +
                '}';
    }
}


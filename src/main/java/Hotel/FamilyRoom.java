package Hotel;

public class FamilyRoom extends Room {
    public FamilyRoom(double rate) {
        super("Family Room", rate);
    }
    @Override
    public int getMaxGuests() {
        return 4;
    }
    @Override
    public String getRoomType() {
        return "FamilyRoom";
    }
    @Override
    public String toString() {
        return "FamilyRoom{" +
                "roomType='" + getRoomType() + '\'' +
                ", rate=" + getRate() +
                '}';
    }
}

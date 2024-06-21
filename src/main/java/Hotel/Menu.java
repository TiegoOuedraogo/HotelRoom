package Hotel;

public class Memu {
    public static void main(String[] args) {
        Room doubleStandard = new DoubleStandardRoom(150);
        Room deluxeDouble = new DeluxeDoubleRoom(200);
        Room juniorSuite = new JuniorSuite(300);
        Room grandSuite = new GrandSuite(400);

        System.out.println("Room Type: " + doubleStandard.getRoomType() + ", Rate: " + doubleStandard.getRate());
        System.out.println("Room Type: " + deluxeDouble.getRoomType() + ", Rate: " + deluxeDouble.getRate());
        System.out.println("Room Type: " + juniorSuite.getRoomType() + ", Rate: " + juniorSuite.getRate());
        System.out.println("Room Type: " + grandSuite.getRoomType() + ", Rate: " + grandSuite.getRate());
    }
}

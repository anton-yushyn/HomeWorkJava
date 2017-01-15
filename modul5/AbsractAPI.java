package modul5;

/**
 * Created by admin on 015 15.01.17.
 */
public class AbsractAPI implements API {


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }
}

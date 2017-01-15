package modul5;

/**
 * Created by admin on 015 15.01.17.
 */
public abstract class AbsractAPI implements API {


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

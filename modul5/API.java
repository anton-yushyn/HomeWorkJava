package modul5;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}

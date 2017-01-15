package modul5;

import java.util.Date;

public class BookingComAPI extends AbsractAPI {

    Room[] roomsBook = new Room[5];

    public BookingComAPI() {
        roomsBook[0] = new Room(001, 200, 1, new Date(4), "Hisperia", "Olomouc");
        roomsBook[1] = new Room(002, 300, 2, new Date(1), "Hisperia", "Olomouc");
        roomsBook[2] = new Room(003, 600, 3, new Date(2), "Hisperia", "Olomouc");
        roomsBook[3] = new Room(004, 300, 2, new Date(3), "Juno", "Praha");
        roomsBook[4] = new Room(005, 150, 1, new Date(2), "Juno", "Praha");
    }

//    public Room[] getRoomsBook() {
//        return roomsBook;
//    }
}

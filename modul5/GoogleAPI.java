package modul5;

import java.util.Date;

public class GoogleAPI extends AbsractAPI {
    Room[] roomGoogle = new Room[5];

    public GoogleAPI(){
        roomGoogle[0]= new Room(001, 200, 1, new Date(4), "Slavutich", "Kyiv");
        roomGoogle[1]= new Room(002, 50, 1, new Date(1), "Ukraine", "Kyiv");
        roomGoogle[2]= new Room(003, 750, 1, new Date(8), "Slavutich", "Kyiv");
        roomGoogle[3]= new Room(004, 40, 1, new Date(1), "Hisperia", "Olomouc");
        roomGoogle[4]= new Room(005, 220, 1, new Date(5), "Ukraine", "Kyiv");
    }
    @Override
    public Room[] getRooms() {
        return roomGoogle;
    }
}

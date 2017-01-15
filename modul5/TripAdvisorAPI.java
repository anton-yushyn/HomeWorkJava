package modul5;

import java.util.Date;

public class TripAdvisorAPI extends AbsractAPI {

    Room[] roomTrip = new Room[5];

    public TripAdvisorAPI(){

        roomTrip[0] = new Room(001, 200, 1, new Date(4), "Hisperia", "Olomouc");
        roomTrip[1] = new Room(002, 300, 2, new Date(1), "Hisperia", "Olomouc");
        roomTrip[2] = new Room(003, 600, 3, new Date(2), "Hisperia", "Olomouc");
        roomTrip[3] = new Room(004, 300, 2, new Date(3), "Juno", "Praha");
        roomTrip[4] = new Room(005, 150, 1, new Date(2), "Juno", "Praha");

    }
}

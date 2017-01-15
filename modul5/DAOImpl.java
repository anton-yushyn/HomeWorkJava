package modul5;

import java.util.Date;

/**
 * Created by admin on 015 15.01.17.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Комната " +room.getId() + " сохранена.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Комната " +room.getId() + " удалена.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Комната " +room.getId() + " обновленна.");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(20, 300, 2,new Date(),"hotel", "city"); // эту часть я подсмотрел. Не пойму почему так происходит? для чего нужно создавть экземпляр?
        System.out.println("Комната с ID " +id + " найдена.");
        return room;
    }
}

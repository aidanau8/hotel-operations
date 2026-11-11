
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testCheckIn() {
        Room room = new Room(2, 150.00, false, false);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testCheckOut() {
        Room room = new Room(2, 150.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testCleanRoom() {
        Room room = new Room(2, 150.00, false, true);

        room.cleanRoom();

        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    public void testCannotCheckInDirtyRoom() {
        Room room = new Room(2, 150.00, false, true);

        room.checkIn();

        assertFalse(room.isOccupied());
    }

    @Test
    public void testCannotCleanOccupiedRoom() {
        Room room = new Room(2, 150.00, true, true);

        room.cleanRoom();

        assertTrue(room.isDirty());
    }
}

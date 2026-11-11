
public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // First Constructor
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Second Constructor
    public Hotel(String name, int numberOfSuites, int numberOfRooms,
                 int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }


    public int getAvailableSuites() {
        int availableSuites = numberOfSuites - bookedSuites;
        return availableSuites;
    }

    public int getAvailableRooms() {
        int availableRooms = numberOfRooms - bookedBasicRooms;
        return availableRooms;
    }



    public boolean bookRoom(int roomCount, boolean suite) {

        if (roomCount <= 0) {
            return false;
        }

        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }

        return false;
    }

}

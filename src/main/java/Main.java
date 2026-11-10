public class Main {

        public static void main(String[] args) {

            Room room = new Room(2, 150.00, false, false);

            System.out.println("Number of beds: " + room.getNumberOfBeds());
            System.out.println("Price: " + room.getPrice());
            System.out.println("Occupied: " + room.isOccupied());
            System.out.println("Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());


            Reservation reservation = new Reservation("king", 3, true);

            System.out.println("Room type: " + reservation.getRoomType());
            System.out.println("Number of nights: " + reservation.getNumberOfNights());
            System.out.printf("Price per night: $%.2f%n", reservation.getPrice());


        }



}



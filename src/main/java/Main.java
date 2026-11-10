
public class Main {

    public static void main(String[] args) {


        Room room = new Room(2, 150.00, false, false);

        System.out.println("Number of beds: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        System.out.println();


        System.out.println("--- Room Operations ---");

        room.checkIn();
        System.out.println("After check-in: " + room.isAvailable());

        room.checkOut();
        System.out.println("After check-out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After cleaning: " + room.isAvailable());

        System.out.println();


        Reservation reservation = new Reservation("king", 3, true);

        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.printf("Price per night: $%.2f%n", reservation.getPrice());

        System.out.println();


        Employee employee = new Employee(101, "John", "IT", 20.00, 45);

        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: " + employee.getTotalPay());



        System.out.println();

        System.out.println("--- Employee Time Tracking ---");

        employee.punchIn(9);
        employee.punchOut(17);

        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: " + employee.getTotalPay());



        System.out.println();

        System.out.println("--- Employee Overloading ---");

        Employee employee2 = new Employee(102, "Sarah", "IT", 20.00, 0);

        employee2.punchIn(9);
        employee2.punchOut(17);

        System.out.println("Hours after manual punch: "
                + employee2.getRegularHours());

        employee2.punchIn();
        employee2.punchOut();

        System.out.println("Hours after automatic punch: "
                + employee2.getRegularHours());

    }
}

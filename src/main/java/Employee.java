
import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalTime startTime;
    private boolean punchedIn;

    // Constructor
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchedIn = false;
    }


    public double getRegularHours() {

        if (this.hoursWorked > 40) {
            return 40;
        } else {
            return this.hoursWorked;
        }
    }


    public double getOvertimeHours() {

        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }


    public double getTotalPay() {

        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }


    public void punchIn(int time) {

        if (time < 0 || time > 23) {
            System.out.println("Invalid time.");
            return;
        }

        if (!punchedIn) {
            this.startTime = LocalTime.of(time, 0);
            this.punchedIn = true;
        } else {
            System.out.println("Employee is already punched in.");
        }
    }


    public void punchOut(int time) {

        if (time < 0 || time > 23) {
            System.out.println("Invalid time.");
            return;
        }

        if (punchedIn) {
            LocalTime endTime = LocalTime.of(time, 0);
            calculateHours(endTime);
        } else {
            System.out.println("Employee is not punched in.");
        }
    }

    // Overloaded Punch In
    public void punchIn() {

        if (!punchedIn) {
            this.startTime = LocalTime.now();
            this.punchedIn = true;
        } else {
            System.out.println("Employee is already punched in.");
        }
    }

    // Overloaded Punch Out
    public void punchOut() {

        if (punchedIn) {
            LocalTime endTime = LocalTime.now();
            calculateHours(endTime);
        } else {
            System.out.println("Employee is not punched in.");
        }
    }


    private void calculateHours(LocalTime endTime) {

        int startMinutes = startTime.getHour() * 60
                + startTime.getMinute();

        int endMinutes = endTime.getHour() * 60
                + endTime.getMinute();

        double hours = (endMinutes - startMinutes) / 60.0;

        if (hours >= 0) {
            this.hoursWorked += hours;
            this.punchedIn = false;
        } else {
            System.out.println("Invalid punch-out time.");
        }
    }
}

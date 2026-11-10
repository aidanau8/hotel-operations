
public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department,
                    double payRate, int hoursWorked) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchedIn = false;
    }

    public int getRegularHours() {

        if (this.hoursWorked > 40) {
            return 40;
        } else {
            return this.hoursWorked;
        }
    }

    public int getOvertimeHours() {

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

    // Exercise 2 - Punch In
    public void punchIn(int time) {

        if (!punchedIn) {
            this.startTime = time;
            this.punchedIn = true;
        } else {
            System.out.println("Employee is already punched in.");
        }
    }

    // Exercise 2 - Punch Out
    public void punchOut(int time) {

        if (punchedIn) {
            int hours = time - this.startTime;
            this.hoursWorked += hours;
            this.punchedIn = false;
        } else {
            System.out.println("Employee is not punched in.");
        }
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testPunchInAndOut() {

        Employee employee = new Employee(
                101, "John", "IT", 20.00, 0);

        employee.punchIn(9);
        employee.punchOut(17);

        assertEquals(8.0, employee.getRegularHours(), 0.001);
    }

    @Test
    public void testOvertimeHours() {

        Employee employee = new Employee(
                102, "Sarah", "IT", 20.00, 38);

        employee.punchIn(9);
        employee.punchOut(17);

        assertEquals(40.0, employee.getRegularHours(), 0.001);
        assertEquals(6.0, employee.getOvertimeHours(), 0.001);
    }

    @Test
    public void testMultipleShifts() {

        Employee employee = new Employee(
                103, "Mike", "IT", 20.00, 0);

        employee.punchIn(9);
        employee.punchOut(13);

        employee.punchIn(14);
        employee.punchOut(18);

        assertEquals(8.0, employee.getRegularHours(), 0.001);
    }
}

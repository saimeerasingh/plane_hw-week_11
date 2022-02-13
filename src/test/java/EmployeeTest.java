import employee.Employee;
import employee.EmployeeRank;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Vikram", EmployeeRank.FIRSTOFFICER) {
        };
    }

    @Test
    public void name() {
    }
}

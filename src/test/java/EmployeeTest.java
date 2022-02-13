import employee.Employee;
import employee.EmployeeRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Sia", EmployeeRank.FIRSTOFFICER) {
        };
    }

    @Test
    public void hasName() {
        assertEquals("Sia",employee.getName());
    }

}

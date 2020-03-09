package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Employee myEmployee;

    @Test
    void testConstructor()
    {
        myEmployee = new Employee("Meghan", 12345, "08630123", 23 );
        assertEquals("Meghan", myEmployee.getName());
        assertEquals(12345, myEmployee.getEmployeeNum());
        assertEquals("08630123", myEmployee.getPhone());
        assertEquals(23, myEmployee.getAge());
    }
    @Test
    void testConstructor()
    {
        myEmployee = new Employee("Meghan", 12345, "08630123", 23 );
        assertEquals("Meghan", myEmployee.getName());
        assertEquals(12345, myEmployee.getEmployeeNum());
        assertEquals("08630123", myEmployee.getPhone());
        assertEquals(23, myEmployee.getAge());
    }
}

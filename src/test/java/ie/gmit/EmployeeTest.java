/*
    Name: Meghan Fitzgerald
    Date: 9/3/2020
    Contact: g00335180@gmit.ie
    Description: Lab Exam 2 on maven, junit and jacoco

 */

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee myEmployee;

    @BeforeEach
    void init()
    {
        myEmployee = new Employee();
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
    @Test
    void testConstructorInvalidName()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("me",12345, "08630123", 23));
    }
    @Test
    void testConstructorInvalidEmpNum()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("meghan",1234, "08630123", 23));
    }
    @Test
    void testConstructorInvalidPhone()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("meghan",12345, "0863012", 23));
    }
    @Test
    void testConstructorInvalidAge()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("meghan",12345, "0863012", 10));
    }
}

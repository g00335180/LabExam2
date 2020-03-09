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

public class EmployeeListTest {
    Employee myEmployee;
    EmployeeList myEmpList;

    @BeforeEach
    void setup()
    {
        myEmployee = new Employee("Meghan", 12345, "08630123", 23 );
        myEmpList = new EmployeeList();
    }
    @Test
    void testAddEmp(){
        myEmpList.addEmployee((myEmployee));
        assertEquals(1, myEmpList.getSize());
    }
    @Test
    void testFindByName(){
        myEmpList.addEmployee(myEmployee);
        assertEquals(myEmployee, myEmpList.findByName("Meghan"));
    }
}

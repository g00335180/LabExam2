package ie.gmit;

import java.lang.IllegalArgumentException;

public class Employee
{
    private String name;
    private int employeeNum;
    private int phone;
    private int age;

    private int lengthName;
    private int lengthEmpNum;

    public Employee()
    {

    }
    public Employee(String name, int employeeNum)
    {
        lengthName = name.length();
        lengthEmpNum = String.valueOf(employeeNum).length();
        if((lengthName < 3) || (lengthName > 25)) {
            throw new IllegalArgumentException("Invalid Name Error");
        }
        else{
            this.name = name;
            this.employeeNum = employeeNum;
        }
        if((lengthEmpNum > 8) || (lengthEmpNum < 1))
        {

        }

    }
    public String getName()
    {
        return name;
    }

    public int getEmployeeNum()
    {
        return employeeNum;
    }
    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }



}
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
    private int lengthPhNum;


    public Employee()
    {

    }
    public Employee(String name, int employeeNum, int phone, int age )
    {
        lengthName = name.length();
        lengthEmpNum = String.valueOf(employeeNum).length();
        lengthPhNum = String.valueOf(phone).length();
        if((lengthName < 3) || (lengthName > 25)) {
            throw new IllegalArgumentException("Invalid Name Error");
        }
        else{
            this.name = name;
        }
        if((lengthEmpNum > 5) || (lengthEmpNum < 1)) {
            throw new IllegalArgumentException("Invalid Employee Number Error");
        }
        else {
            this.employeeNum = employeeNum;
        }
        if((lengthPhNum > 8) || (lengthPhNum < 1)) {
            throw new IllegalArgumentException("Invalid Phone Number Error");
        }
        else {
            this.phone = phone;
        }
        if(age < 16)
        {
            throw new IllegalArgumentException("Must be over 16");
        }
        else{
            this.age = age;
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
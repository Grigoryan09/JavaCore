package homework.employee.model;

import homework.employee.PositionLevel;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    PositionLevel level;

    public Employee() {
    }

    public Employee(String name, String surname, double salary, String company,PositionLevel level) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.company = company;
        this.level = level;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PositionLevel getLevel() {
        return level;
    }

    public void setLevel(PositionLevel level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(company, employee.company) && level == employee.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company, level);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", level=" + level +
                '}';
    }
}


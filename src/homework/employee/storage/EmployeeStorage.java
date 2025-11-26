package homework.employee.storage;

import homework.employee.PositionLevel;
import homework.employee.model.Employee;

public class EmployeeStorage {


    private Employee[] employees = new Employee[10];
    private int size = 0;
    private int id = 1;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employee.setEmployeeID(generateId(id++));
        employees[size++] = employee;
    }

    private String generateId(int id){
        return String.format("A%04d", id);
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByPositionLevel(PositionLevel positionLevel) {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getLevel().equals(positionLevel)) {
                    System.out.println(employees[i]);
                }
            }
        } else {
            System.out.println("No employee added");
        }
    }

    public void printByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(company)) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in this company.");
        }
    }
}
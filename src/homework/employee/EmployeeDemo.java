package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Commands {


    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage storage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    run = false;
                    System.out.println("Program finished.");
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    storage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    searchByID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchByCompany();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        String id = IDGenerator.generateID();
        System.out.println("Generated Employee ID: " + id);
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Company: ");
        String company = scanner.nextLine();
        System.out.print("Position: ");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, id, salary, company, position);
        storage.add(employee);
        System.out.println("Employee added!");
    }

    private static void searchByID() {
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();
        Employee employee = storage.getById(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void searchByCompany() {
        System.out.print("Enter company name: ");
        String company = scanner.nextLine();

        storage.printByCompany(company);
    }
}

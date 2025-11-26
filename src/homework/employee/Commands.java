package homework.employee;

import static homework.employee.PositionLevel.JUNIOR;
import static homework.employee.PositionLevel.LEAD;
import static homework.employee.PositionLevel.MIDDLE;
import static homework.employee.PositionLevel.SENIOR;

public interface Commands {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    String  SEARCH_EMPLOYEES_BY_POSITION_LEVEL = "5";


    static void printCommands() {
        System.out.println("Please input command:");
        System.out.println("0 - Exit");
        System.out.println("1 - Add employee");
        System.out.println("2 - Print all employees");
        System.out.println("3 - Search employee by ID");
        System.out.println("4 - Search employee by company");
        System.out.println("5 - SEARCH EMPLOYEES BY POSITION LEVEL ");
    }

    static void printPositionLevelMenu() {
        System.out.println("Please select position level ");
        System.out.println("Please input " + JUNIOR.getCode() + " for Junior");
        System.out.println("Please input " + MIDDLE.getCode() + " for Middle");
        System.out.println("Please input " + SENIOR.getCode() + " for Senior");
        System.out.println("Please input " + LEAD.getCode() + " for Lead");
    }
}

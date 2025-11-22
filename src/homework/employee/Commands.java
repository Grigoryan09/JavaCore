package homework.employee;

public interface Commands {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";


   static void printCommands() {
        System.out.println("Please input command:");
        System.out.println("0 - Exit");
        System.out.println("1 - Add employee");
        System.out.println("2 - Print all employees");
        System.out.println("3 - Search employee by ID");
        System.out.println("4 - Search employee by company");
    }
}

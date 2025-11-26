package homework.library;

public interface Commands {

    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_BOOK = "2";
    String PRINT_ALL_AUTHOR = "3";
    String PRINT_ALL_BOOKS = "4";
    String SEARCH_BOOK_BY_TITLE = "5";
    String SEARCH_BOOK_BY_AUTHOR = "6";
    String PRINT_EXPENSIVE = "7";
    String DELETE_BOOK = "8";
    String Search_By_Price_Range = "9";


    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR+ " for ADD_AUTHOR");
        System.out.println("please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for PRINT_ALL_AUTHOR");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("please input " + SEARCH_BOOK_BY_AUTHOR + " for SEARCH_BOOK_BY_AUTHOR");
        System.out.println("please input " + PRINT_EXPENSIVE + " for PRINT EXPENSIVE BOOK");
        System.out.println("please input " + DELETE_BOOK + " for DELETE BY BOOK");
        System.out.println("please input " + Search_By_Price_Range + " for SEARCH BY PRICE RANGE");

    }

}

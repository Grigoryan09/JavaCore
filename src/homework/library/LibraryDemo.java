package homework.library;

import java.util.Scanner;

public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Pleas input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE:
                    System.out.println(bookStorage.getBookMaxPrice());
                case DELETE_BOOK:
                    bookStorage.deleteBookId(Integer.parseInt(scanner.nextLine()));
                case Search_By_Price_Range:
                    System.out.println("Enter min price:");
                    double min = scanner.nextDouble();
                    System.out.println("Enter max price:");
                    double max = scanner.nextDouble();
                    bookStorage.searchByPriceRange(min, max);

            }
        }


    }

    private static void addBook() {
        System.out.println("Pleas input book`s title");
        String bookTitle = scanner.nextLine();
        System.out.println("Pleas input book`s authorName");
        String authorName = scanner.nextLine();
        System.out.println("Pleas input book`s prise");
        double prise = Double.parseDouble(scanner.nextLine());
        System.out.println("Pleas input book`s quantity");
        int quantity = Integer.parseInt(scanner.nextLine());
        Book book = new Book(bookTitle,authorName,prise,quantity);
        System.out.println("Book added successfully");
        bookStorage.add(book);
    }
}

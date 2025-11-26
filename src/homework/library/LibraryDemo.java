package homework.library;

import homework.library.model.Author;
import homework.library.model.Book;
import homework.library.storage.AuthorStorage;
import homework.library.storage.BookStorage;
import java.util.Scanner;

public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Pleas input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    serchBookByAuthor();
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

    private static void serchBookByAuthor() {
        System.out.println("Pleas choose Author by phone number");
        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            bookStorage.searchBookByAuthor(author);
        } else {
            System.out.println("Wrong author`s phone number, please try again!!!");
        }
    }

    private static void addAuthor() {
        System.out.println("Pleas input author`s name");
        String name = scanner.nextLine();
        System.out.println("Pleas input author`s surname");
        String surname = scanner.nextLine();
        System.out.println("Pleas input author`s age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Pleas input author`s number");
        String phoneNumber = scanner.nextLine();

        Author author = new Author(name, surname, age, phoneNumber);
        authorStorage.add(author);
        System.out.println("Author added successfully");
    }

    private static void addBook() {
        System.out.println("Pleas choose Author by phone number");
        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            System.out.println("Pleas input book`s title");
            String bookTitle = scanner.nextLine();
            System.out.println("Pleas input book`s prise");
            double prise = Double.parseDouble(scanner.nextLine());
            System.out.println("Pleas input book`s quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            Book book = new Book(bookTitle, author, prise, quantity);
            System.out.println("Book added successfully");
            bookStorage.add(book);
        } else {
            System.out.println("Wrong author`s phone number, please try again!!!");
        }


    }
}

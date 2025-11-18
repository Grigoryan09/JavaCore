package homework.library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;
    private int id = 1;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
        book.setId(id);
        id++;
    }

    private void extend() {
        Book[] tep = new Book[size + 10];
        System.arraycopy(books, 0, tep, 0, size);
        books = tep;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookMaxPrice() {

        double prise = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > prise) {
                prise = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteBookId(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Book not found!");
            return;
        }
        if (books[index].getQuantity() > 1) {
            books[index].setQuantity(books[index].getQuantity() - 1);
        } else {
            for (int i = 0; i < size; i++) {
                books[i] = books[i + 1];
            }
            size--;
        }
    }

    public void searchByPriceRange(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                System.out.println(books[i]);
            }
        }
    }
}







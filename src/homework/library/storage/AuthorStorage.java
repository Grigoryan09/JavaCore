package homework.library.storage;

import homework.library.model.Author;
import homework.library.model.Book;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tep = new Author[size + 10];
        System.arraycopy(authors, 0, tep, 0, size);
        authors = tep;
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getPhoneNumber().equals(phoneNumber)) {
                return authors[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

}

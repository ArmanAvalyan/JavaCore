package homeworks.author;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        System.arraycopy(books, 0, temp, 0, size);
        books = temp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("The library is empty");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBookByTitle(String title) {
        if (size == 0) {
            System.out.println("The library is empty");
        }
        if (getByTitle(title) != null) {
            System.out.println(getByTitle(title));
        } else {
            System.out.println("No such book!");
        }
    }

    public void searchBookByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public void countBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                count += +books[i].getCount();
            }
        }
        System.out.println(count);
    }

    public Book getByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                return books[i];
            }
        }
        return null;
    }
}

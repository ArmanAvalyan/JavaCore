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
        if (!isEmptyBook()) {
            for (int i = 0; i < size; i++) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if ((books[i]).getTitle().contains(title)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public int countBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                count += books[i].getCount();
            }
        }
        return count;
    }

    public Book getByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (!books[i].getAuthor().equals(author)) {
                continue;
            }
            for (int j = i; j < size - 1; j++) {
                books[j] = books[j + 1];
            }
            i--;
            size--;
        }
    }

    public boolean isEmptyBook() {
        if (size == 0) {
            System.out.println("\033[1;91m" + "The library is empty" + "\033[0m");
            return true;
        }
        return false;
    }

    public void deleteBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (!books[i].getTitle().equals(title)) {
                continue;
            }
            for (int j = i; j < size - 1; j++) {
                books[j] = books[j + 1];
            }
            size--;
        }
    }
}


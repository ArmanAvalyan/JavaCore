package homeworks.author;

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
        Author[] temp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, temp, 0, size);
        authors = temp;
    }

    public void print() {
        if (isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }


    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            } else {
                System.out.println("\033[1;91m" + "No such author" + "\033[0m");
                break;
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void deleteAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (authors[i].equals(author)) {
                authors[i] = authors[i + 1];
            }
        }
        size--;
    }

    public boolean isEmptyAuthor() {
        return size == 0;
    }
}
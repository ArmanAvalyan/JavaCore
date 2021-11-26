package homeworks.author;

import java.util.Scanner;

public class AuthorBookTest {

    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "6";
    private static final String COUNT_BOOKS_BY_AUTHOR = "7";
    private static final String PRINT_AUTHORS = "8";
    private static final String PRINT_BOOKS = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String DELETE_BY_AUTHOR = "12";
    private static final String DELETE_AUTHOR = "13";
    private static final String DELETE_BOOK = "14";

    public static void main(String[] args) {

        Author author1 = new Author("Poxos", "Poxosyan", "poxos@gmail.com",
                34, "male");
        authorStorage.add(author1);

        Author author2 = new Author("Petros", "Petrosyan", "petros@gmail.com",
                14, "male");
        authorStorage.add(author2);

        Author author3 = new Author("Martiros", "Martirosyan", "martiros@gmail.com",
                23, "male");
        authorStorage.add(author3);
        Author author4 = new Author("Vardan", "Vardanyan", "vardan@gmail.com",
                27, "male");
        authorStorage.add(author4);

        Book book1 = new Book("Book1", "Desc1", 2.3, 7, author2);
        bookStorage.add(book1);
        Book book2 = new Book("Book2", "Desc2", 1.3, 4, author1);
        bookStorage.add(book2);
        Book book3 = new Book("Book3", "Desc3", 2.3, 7, author2);
        bookStorage.add(book3);
        Book book4 = new Book("Book4", "Desc4", 2.3, 7, author2);
        bookStorage.add(book4);
        Book book5 = new Book("Book5", "Desc5", 6.1, 5, author3);
        bookStorage.add(book5);
        Book book6 = new Book("Book6", "Desc6", 641, 15, author2);
        bookStorage.add(book6);

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    System.out.println("\033[1;93m" + "GOOD BYE!!" + "\033[0m");
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBook();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteOllBooksByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBookByTitle();
                    break;
                default:
                    System.out.println("\033[1;91m" + "Invalid command!" + "\033[0m");
            }
        }
    }

    private static void addAuthor() {
        System.out.print("Enter the author name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the author surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter the author email: ");
        String email = scanner.nextLine();
        System.out.print("Input the author age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Input the author gender: ");
        String gender = scanner.nextLine();
        authorStorage.add(new Author(name, surname, email, age, gender));
        System.out.println("\033[1;92m" + "Thank you! Author was added" + "\033[0m");
    }

    private static void addBook() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.print("Please input book's title: ");
            String title = scanner.nextLine();
            System.out.print("Please input book's description: ");
            String desc = scanner.nextLine();
            System.out.print("Please input book's price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Please input book's count: ");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);
            bookStorage.add(book);
            System.out.println("\033[1;92m" + "Thank you! Book was added" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            addBook();
        }
    }

    private static void searchByName() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        System.out.print("Please input author keyword: ");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void searchByAge() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        System.out.print("Please input min age: ");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Please input max age: ");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void searchBooksByTitle() {
        if (bookStorage.isEmptyBook()) {
            System.out.println("\033[1;91m" + "The library is empty!!" + "\033[0m");
            return;
        }
        System.out.print("Please input book title: ");
        String title = scanner.nextLine();
        Book book = bookStorage.getByTitle(title);
        if (book != null) {
            bookStorage.searchBookByTitle(title);
        } else {
            System.out.println("\033[1;91m" + "No such book!" + "\033[0m");
        }
    }

    private static void searchBooksByAuthor() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchBookByAuthor(email);
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            searchBooksByAuthor();
        }
    }

    private static void countBooksByAuthor() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time!" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("\033[1;92m" + author.getName() + " has " +
                    bookStorage.countBooksByAuthor(email) + " books" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            countBooksByAuthor();
        }
    }

    private static void changeAuthor() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.print("Please input new author name: ");
            author.setName(scanner.nextLine());
            System.out.print("Please input new author surname: ");
            author.setSurname(scanner.nextLine());
            System.out.print("Please input new author age: ");
            author.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.print("Please input new author gender: ");
            author.setGender(scanner.nextLine());
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            changeAuthor();
        }
    }

    private static void changeBook() {
        if (bookStorage.isEmptyBook()) {
            System.out.println("\033[1;91m" + "The library is empty!!" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose book title: ");
        String title = scanner.nextLine();
        Book book = bookStorage.getByTitle(title);
        if (book != null) {
            System.out.print("Please input new author email: ");
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
                System.out.println("\033[1;92m" + "Thank you․ The author of the book changed!" + "\033[0m");
            } else {
                System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
                changeBook();
            }
        } else {
            System.out.println("\033[1;91m" + "No such book! Please try again" + "\033[0m");
            changeBook();
        }
    }

    private static void deleteOllBooksByAuthor() {
        if (bookStorage.isEmptyBook()) {
            System.out.println("\033[1;91m" + "The library is empty!!" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
            System.out.println("\033[1;92m" + "Thank you, books was deleted" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            deleteOllBooksByAuthor();
        }
    }

    private static void deleteAuthor() {
        if (authorStorage.isEmptyAuthor()) {
            System.out.println("\033[1;91m" + "There are no authors at this time" + "\033[0m");
            return;
        }
        displayAuthorsList();
        System.out.print("Please choose author's email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.deleteAuthor(author);
            System.out.println("\033[1;92m" + "Author was deleted" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "Invalid email! Please try again" + "\033[0m");
            deleteAuthor();
        }
    }

    private static void deleteBookByTitle() {
        if (bookStorage.isEmptyBook()) {
            System.out.println("\033[1;91m" + "The library is empty!!" + "\033[0m");
            return;
        }
        System.out.print("Please input book title: ");
        String title = scanner.nextLine();
        Book book = bookStorage.getByTitle(title);
        if (book != null) {
            bookStorage.deleteBookByTitle(title);
            System.out.println("\033[1;92m" + "Thank you! Book was deleted" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "No such book!" + "\033[0m");
        }
    }

    private static void printCommands() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for search books by author");
        System.out.println("Please input " + COUNT_BOOKS_BY_AUTHOR + " for count books by author");
        System.out.println("Please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("Please input " + PRINT_BOOKS + " for print books");
        System.out.println("Please input " + CHANGE_AUTHOR + " for change author");
        System.out.println("Please input " + CHANGE_BOOK_AUTHOR + " for change book");
        System.out.println("Please input " + DELETE_BY_AUTHOR + " for delete author all books");
        System.out.println("Please input " + DELETE_AUTHOR + " for delete author");
        System.out.println("Please input " + DELETE_BOOK + " for delete book by title" + "\u001B[0m");
    }

    private static void displayAuthorsList() {
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
    }
}

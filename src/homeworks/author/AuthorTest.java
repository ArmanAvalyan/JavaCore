package homeworks.author;

import java.util.Scanner;

public class AuthorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indicate the number of authors: ");
        int count = scanner.nextInt();

        AuthorStorage authorStorage = new AuthorStorage();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter the name: ");
            String name = scanner.next();

            System.out.print("Enter the surname: ");
            String surname = scanner.next();

            System.out.print("Enter the email: ");
            String email = scanner.next();

            System.out.print("Enter the age: ");
            int age = scanner.nextInt();

            System.out.print("Enter the gender: ");
            String gender = scanner.next();

            authorStorage.add(new Author(name, surname, email, age, gender));

            if (i == count) {
                break;
            }

            System.out.println("Enter the data of the next author");
        }
        authorStorage.print();
    }
}

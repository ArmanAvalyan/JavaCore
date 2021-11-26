package homeworks.author;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;

    public Author(String name, String surname, String email, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Surname: " + surname +
                ", E-mail: " + email +
                ", Age: " + age +
                ", Gender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && name.equals(author.name) && surname.equals(author.surname) &&
                email.equals(author.email) && gender.equals(author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, age, gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

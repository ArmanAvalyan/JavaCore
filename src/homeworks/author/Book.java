package homeworks.author;

public class Book {

    private String title;
    private String description;
    private double price;
    private int count;
    private Author author;

    public Book(String title, String description, double price, int count, Author author) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.author = author;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Description: " + description +
                ", Price: " + price +
                ", Count: " + count +
                ", Author: " + author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

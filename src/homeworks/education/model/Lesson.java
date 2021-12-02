package homeworks.education.model;

import java.util.Objects;

public class Lesson {

    private String lessonID;
    private String name;
    private String duration;
    private String lecturerName;
    private int price;


    public Lesson(String lessonID, String name, String duration, String lecturerName, int price) {
        this.lessonID = lessonID;
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public Lesson() {

    }

    public String getLessonID() {
        return lessonID;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Double.compare(lesson.price, price) == 0 &&
                Objects.equals(lessonID, lesson.lessonID) &&
                Objects.equals(name, lesson.name) &&
                Objects.equals(duration, lesson.duration)
                && Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonID, name, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson ID: " + lessonID +
                ", Name: " + name +
                ", Duration: " + duration +
                ", LecturerName: " + lecturerName +
                ", Price: " + price + '\u0024';
    }
}

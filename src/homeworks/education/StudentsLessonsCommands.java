package homeworks.education;

import homeworks.education.model.Lesson;
import homeworks.education.model.Student;
import homeworks.education.storage.LessonsStorage;
import homeworks.education.storage.StudentsStorage;

import java.util.Scanner;

public interface StudentsLessonsCommands {

    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";

    static void showMenu() {
        System.out.println("\033[0;92m" + "Please input " + EXIT + " to exit");
        System.out.println("Please input " + ADD_LESSON + " to add lesson");
        System.out.println("Please input " + ADD_STUDENT + " to add student");
        System.out.println("Please input " + PRINT_STUDENTS + " to print students");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " to print students by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " to print lessons");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " to delete lesson by ID");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " to delete student by email" + "\033[0m");
    }
}

package homeworks.education;

import java.util.Scanner;

public class StudentLessonTest {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentsStorage studentStorage = new StudentsStorage();
    private static LessonsStorage lessonStorage = new LessonsStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("AR12", "JAVA", "1 year",
                "John", 15);
        lessonStorage.add(lesson1);
        Lesson lesson2 = new Lesson("AR36", "PHP", "2 year",
                "Smith", 55);
        lessonStorage.add(lesson2);
        Lesson lesson3 = new Lesson("AR47", "JS", "3 year",
                "Mike", 19);
        lessonStorage.add(lesson3);
        Lesson lesson4 = new Lesson("AR236", "HTML", "4 year",
                "Bob", 75);
        lessonStorage.add(lesson4);
        Lesson lesson5 = new Lesson("AR278", "JS", "5 month",
                "Mike", 13);
        lessonStorage.add(lesson5);

        Student student1 = new Student("Poxos", "Poxosyan", 25,
                "poxos@gmail.com", "124569", lesson1);
        studentStorage.add(student1);
        Student student2 = new Student("Petros", "Petrosyan", 15,
                "petros@gmail.com", "123669", lesson4);
        studentStorage.add(student2);
        Student student3 = new Student("Martiros", "Martirosyan", 28,
                "martiros@gmail.com", "569", lesson3);
        studentStorage.add(student3);


        boolean isRun = true;
        while (isRun) {
            showMenu();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    System.out.println("\033[0;93m" + "GOOD BYE!!" + "\033[0m");
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    displayStudentsList();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    displayLessonsList();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByID();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("\033[1;91m" + "Invalid command!!" + "\033[0m");
            }
        }
    }

    private static void deleteStudentByEmail() {
        if (studentsIsEmpty()) {
            return;
        }
        displayStudentsList();
        System.out.print("Please input the student email: ");
        String email = scanner.nextLine();
        Student student = studentStorage.getStudent(email);
        if (student != null) {
            studentStorage.deleteStudentByEmail(student);
            System.out.println("\033[1;92m" + "Thank you, student was deleted" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "There is no student with that email address" + "\033[1;91m");
        }
    }

    private static void deleteLessonByID() {
        if (lessonsIsEmpty()) {
            return;
        }
        displayLessonsList();
        System.out.print("Please input the lesson ID: ");
        String lessonID = scanner.nextLine();
        Lesson lesson = lessonStorage.getLesson(lessonID);
        if (lesson != null) {
            lessonStorage.deleteLessonByID(lesson);
            System.out.println("\033[1;92m" + "Thank you, lesson was deleted" + "\033[0m");
        } else {
            System.out.println("\033[1;91m" + "No such lesson has been found" + "\033[0m");
        }
    }

    private static void printStudentsByLesson() {
        if (lessonsIsEmpty() || studentsIsEmpty()) {
            return;
        }
        displayLessonsList();
        System.out.print("Please input the lesson ID: ");
        String lessonID = scanner.nextLine();
        Lesson lesson = lessonStorage.getLesson(lessonID);
        if (lesson != null) {
            studentStorage.printStudentsByLesson(lesson);
        } else {
            System.out.println("\033[1;91m" + "No such lesson has been found" + "\033[0m");
        }
    }

    private static void addLesson() {
        System.out.print("Please input the lesson ID: ");
        String lessonID = scanner.nextLine();
        if (lessonStorage.getLesson(lessonID) == null) {
            System.out.println("Please input the lesson Name, Duration, LectureName, Price");
            String lessonDataStr = scanner.nextLine();
            String[] lessonData = lessonDataStr.split(", ");
            if (lessonData.length == 4) {
                int price = Integer.parseInt(lessonData[3]);
                Lesson lesson = new Lesson(lessonID, lessonData[0],
                        lessonData[1], lessonData[2], price);
                lessonStorage.add(lesson);
                System.out.println("\033[0;93m" + "Thank you lesson was added" + "\033[0m");
            } else {
                System.out.println("\033[1;91m" + "Invalid data" + "\033[1;91m");
            }
        } else {
            System.out.println("\033[1;91m" + "Lesson with this ID already exists" + "\033[1;91m");
        }
    }

    private static void addStudent() {
        if (lessonsIsEmpty()) {
            return;
        }
        displayLessonsList();
        System.out.print("Please input the lesson ID: ");
        String lessonID = scanner.nextLine();
        Lesson lesson = lessonStorage.getLesson(lessonID);
        if (lesson != null) {
            System.out.print("Please input the student email: ");
            String email = scanner.nextLine();
            if (studentStorage.getStudent(email) == null) {
                System.out.println("Please input student Name, Surname, Age, Phone");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(", ");
                if (studentData.length == 4) {
                    int age = Integer.parseInt(studentData[2]);
                    Student student = new Student(studentData[0], studentData[1],
                            age, email, studentData[3], lesson);
                    studentStorage.add(student);
                    System.out.println("\033[0;93m" + "Thank you student was added" + "\033[0m");
                } else {
                    System.out.println("\033[1;91m" + "Invalid data" + "\033[0m");
                }
            } else {
                System.out.println("\033[1;91m" + "Student with this email already exists" + "\033[0m");
            }
        } else {
            System.out.println("\033[1;91m" + "No such lesson has been found" + "\033[0m");
        }
    }

    private static void showMenu() {
        System.out.println("\033[0;92m" + "Please input " + EXIT + " to exit");
        System.out.println("Please input " + ADD_LESSON + " to add lesson");
        System.out.println("Please input " + ADD_STUDENT + " to add student");
        System.out.println("Please input " + PRINT_STUDENTS + " to print students");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " to print students by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " to print lessons");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " to delete lesson by ID");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " to delete student by email" + "\033[0m");
    }

    private static void displayLessonsList() {
        if (lessonsIsEmpty()) {
            return;
        }
        System.out.println("----------");
        lessonStorage.printLessons();
        System.out.println("----------");
    }

    private static void displayStudentsList() {
        if (studentsIsEmpty()) {
            return;
        }
        System.out.println("----------");
        studentStorage.printStudents();
        System.out.println("----------");
    }

    private static boolean studentsIsEmpty() {
        if (studentStorage.isEmptyStudents()) {
            System.out.println("\033[1;91m" + "There are no students at this time!" + "\033[0m");
            return true;
        }
        return false;
    }

    private static boolean lessonsIsEmpty() {
        if (lessonStorage.isEmptyLessons()) {
            System.out.println("\033[1;91m" + "There are no lessons at this time!" + "\033[0m");
            return true;
        }
        return false;
    }
}

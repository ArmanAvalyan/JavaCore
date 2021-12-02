package homeworks.education;

import homeworks.education.model.Lesson;
import homeworks.education.model.Student;
import homeworks.education.storage.LessonsStorage;
import homeworks.education.storage.StudentsStorage;
import homeworks.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class StudentLessonTest implements StudentsLessonsCommands {

        static Scanner scanner = new Scanner(System.in);
        static StudentsStorage studentStorage = new StudentsStorage();
        static LessonsStorage lessonStorage = new LessonsStorage();

        public static void main(String[] args) throws ParseException {
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
                    "poxos@gmail.com", "124569", new Date(), new Lesson[]{lesson1, lesson4, lesson3});
            studentStorage.add(student1);
            Student student2 = new Student("Petros", "Petrosyan", 15,
                    "petros@gmail.com", "123669",new Date(), new Lesson[]{lesson4, lesson1});
            studentStorage.add(student2);
            Student student3 = new Student("Martiros", "Martirosyan", 28,
                    "martiros@gmail.com", "569", new Date(), new Lesson[]{lesson1});
            studentStorage.add(student3);

            boolean isRun = true;
            while (isRun) {
                StudentsLessonsCommands.showMenu();
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
                studentStorage.deleteStudent(student);
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
                lessonStorage.deleteLesson(lesson);
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

        private static void addStudent() throws ParseException {
            if (lessonsIsEmpty()) {
                return;
            }
            System.out.print("Please input the student email: ");
            String email = scanner.nextLine();
            if (studentStorage.getStudent(email) == null) {
                displayLessonsList();
                System.out.print("Please input the lesson/lessons ID (ID1, ID2, ...): ");
                String lessonsDataStr = scanner.nextLine();
                String[] lessonsData = lessonsDataStr.split(", ");
                Lesson[] lessons = new Lesson[lessonsData.length];
                for (int i = 0; i < lessons.length; i++) {
                    if (lessonStorage.getLesson(lessonsData[i]) != null) {
                        lessons[i] = lessonStorage.getLesson(lessonsData[i]);
                    } else {
                        System.out.println("\033[1;91m" + "No such lesson/lessons has been found" + "\033[0m");
                        return;
                    }
                }
                System.out.println("Please input student name, surname, age, phone, registered date[01/01/1900]");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(", ");
                int age = Integer.parseInt(studentData[3]);
                Date registeredDate = DateUtil.stringToDate(studentData[4]);
                if (studentData.length == 5) {
                    Student student = new Student(studentData[0], studentData[1],
                            age, email, studentData[3],  registeredDate, lessons);
                    studentStorage.add(student);
                    System.out.println("\033[0;93m" + "Thank you student was added" + "\033[0m");
                } else {
                    System.out.println("\033[1;91m" + "Invalid data" + "\033[0m");
                }
            } else {
                System.out.println("\033[1;91m" + "Student with this email already exists" + "\033[0m");
            }
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
            studentStorage.printStudents();
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

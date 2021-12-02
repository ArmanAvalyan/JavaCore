package homeworks.education.storage;

import homeworks.education.model.Lesson;
import homeworks.education.model.Student;
import homeworks.education.util.ArrayUtil;

public class StudentsStorage {

    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    public Student getStudent(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
            if (i == size - 1) {
                return;
            }
            System.out.println("-------------------");
        }
    }

    public boolean isEmptyStudents() {
        return size == 0;
    }

    private void extend() {
        Student[] temp = new Student[students.length + 10];
        System.arraycopy(students, 0, temp, 0, size);
        students = temp;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            Lesson[] temp = students[i].getLessons();
            for (Lesson value : temp) {
                if (value.equals(lesson)) {
                    System.out.println(students[i]);
                }
            }
        }
    }

    public void deleteStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                ArrayUtil.deleteByIndex(students, i, size);
                size--;
                break;
            }
        }
    }
}

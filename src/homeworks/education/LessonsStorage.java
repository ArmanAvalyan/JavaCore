package homeworks.education;

public class LessonsStorage {

    private Lesson[] lessons = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    public Lesson getLesson(String id) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonID().equals(id)) {
                return lessons[i];
            }
        }
        return null;
    }

    public void printLessons() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    private void extend() {
        Lesson[] temp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, temp, 0, size);
        lessons = temp;
    }

    public boolean isEmptyLessons() {
        return size == 0;
    }

    public void deleteLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].equals(lesson)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                size--;
                break;
            }
        }
    }
}

package homeworks.education;

import homeworks.education.model.Lesson;
import homeworks.education.model.Student;
import homeworks.education.util.DateUtil;

public interface Clas  {

    Lesson lesson1 = new Lesson("AR12", "JAVA", "1 year",
            "John", 15);
    Lesson lesson2 = new Lesson("AR36", "PHP", "2 year",
            "Smith", 55);

    Lesson lesson3 = new Lesson("AR47", "JS", "3 year",
            "Mike", 19);
    Lesson lesson4 = new Lesson("AR236", "HTML", "4 year",
            "Bob", 75);
    Lesson lesson5 = new Lesson("AR278", "JS", "5 month",
            "Mike", 13);

//    Student student1 = new Student("Poxos", "Poxosyan", 25,
//                "poxos@gmail.com", "124569", DateUtil.stringToDate("15/03/2019"),
//                new Lesson[]{lesson1, lesson4, lesson3});
//        Student student2 = new Student("Petros", "Petrosyan", 15,
//                "petros@gmail.com", "123669",DateUtil.stringToDate("02/12/2020"),
//                new Lesson[]{lesson4, lesson1});
//        Student student3 = new Student("Martiros", "Martirosyan", 28,
//                "martiros@gmail.com", "569", DateUtil.stringToDate("01/10/2021"),
//                new Lesson[]{lesson1});


}

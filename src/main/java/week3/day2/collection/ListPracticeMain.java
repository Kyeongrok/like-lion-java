package week3.day2.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        // for each
        for (Student student : studentObjs) {
            System.out.println(student.getName());
        }
//        // list에 들어있는 element개수 세기
//        System.out.println(students.size());

    }
}

package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private final List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Egor1", 2, 7);
        Student st2 = new Student("Egor2", 3, 8);
        Student st3 = new Student("Egor3", 4, 9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() throws NullPointerException {
        System.out.println("Информация о студентах: ");
        System.out.println(students);
        if (false) {
            throw new NullPointerException();
        }

        return students;
    }
}

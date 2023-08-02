package Sem4.service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import Sem4.data.Student;
import Sem4.data.StudentGroup;

import Sem4.data.User;


public class TeacherService {

    private StudentGroup teacherGroup;

    public void createTeacher(User user) {
        teacherGroup.createTeacher(user);
    }

    public Student getTeacherFromTeacherGroup(String firstName, String secondName) {
        Iterator<Student> iterator = teacherGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)) {
                result.add(student);
            }
        }
        if (result.size() == 0) {
            throw new IllegalStateException(
                    String.format("Учитель с именем %s и фамилией %s не найден", firstName, secondName));
        }
        if (result.size() != 1) {
            throw new IllegalStateException("Найдено более одного учителя с указанными именем и фамилией");
        }
        return result.get(0);
    }

    

    

}

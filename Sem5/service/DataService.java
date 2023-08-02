package Sem5.service;

import java.util.ArrayList;
import java.util.List;

import Sem5.model.Student;
import Sem5.model.Teacher;
import Sem5.model.Type;

import Sem5.model.User;

public class DataService {

    private List<User> userList;


    public void create(String lastName, String firstName, String secondName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(secondName, secondName, secondName, id);
            userList.add(teacher);
        }
    }

    public User getUserID(Type type, int id) {
        User resultuser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student && ((Student) user).getStudentID() == id) {
                resultuser = user;
            }
            if (!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherID() == id) {
                resultuser = user;
            }
        }
        return resultuser;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public List<User> getStudentAll(){
        List<User> resulList = new ArrayList<User>();
         for (User user : userList) {
            if (user instanceof Student) {
                resulList.add(user);
            }
        }
        return resulList;
    }

    private int getFreeId(Type type) {
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student) {
                lastID = ((Student) user).getStudentID() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return lastID;
    }

    
}

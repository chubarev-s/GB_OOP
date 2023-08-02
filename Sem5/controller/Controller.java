package Sem5.controller;

import java.util.List;

import Sem5.model.Student;
import Sem5.model.Teacher;
import Sem5.model.Type;
import Sem5.model.User;
import Sem5.service.DataService;
import Sem5.service.StudyGroupService;
import Sem5.view.StudentView;

public class Controller {

    DataService dataService = new DataService();
    StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String lastName, String firstName, String secondName) {
        dataService.create(lastName, firstName, secondName, Type.STUDENT);
    }

    public void createStudyGroup(Teacher teacher, List<Student> students){
        studyGroupService.createStudyGroupService(teacher, students);
    }

    StudentView view = new StudentView();

    public void getAllStudent() {
        List<User> userList = dataService.getStudentAll();
        for (User user : userList) {
            Student student = (Student) user;
            StudentView.printConsole(student);
            System.out.println("StudentID: " + student.getStudentID());
        }
    }

    public void getTeacherId() {
        studyGroupService.getTeacher();
    }
    

}

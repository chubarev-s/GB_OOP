package Sem5.service;

import java.util.List;

import Sem5.model.Student;
import Sem5.model.StudyGroup;
import Sem5.model.Teacher;
import Sem5.model.User;


public class StudyGroupService {
     
    private StudyGroup studyGroup;

    public void createStudyGroupService(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudentGroup() {
        return studyGroup;
    }

    public void createStudent(User user) {
        studyGroup.createStudent(user);
    }

    public List<Student> getStudents(){
        return studyGroup.getStudents();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }
}

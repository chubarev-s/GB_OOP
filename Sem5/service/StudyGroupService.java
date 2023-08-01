package Sem5.service;

import java.util.List;

import Sem5.model.Student;
import Sem5.model.StudyGroup;
import Sem5.model.Teacher;

public class StudyGroupService {
     
    private StudyGroup studyGroup;

    public void createStudyGroupService(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }
}

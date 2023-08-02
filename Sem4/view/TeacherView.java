package Sem4.view;

import java.util.List;
import java.util.logging.Logger;

import Sem4.data.Teacher;
import Sem4.data.Student;
import Sem4.data.StudentGroup;



public class TeacherView implements UserViewInterface<Teacher> {
       
    Logger logger = Logger.getLogger(UserView.class.getName());
    
    @Override
    public void sendOnConsole(List<Teacher> listT){
        System.out.println("ID студентов: ");
        for(Teacher student: listT){
            System.out.println(student.getTeacherId());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

    
    
}

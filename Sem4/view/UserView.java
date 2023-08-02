package Sem4.view;

import Sem4.data.Student;
import Sem4.data.StudentGroup;


import java.util.List;
import java.util.logging.Logger;

public class UserView implements UserViewInterface<Student>{

    Logger logger = Logger.getLogger(UserView.class.getName());

    // public void sendOnConsole(List<User> userList){
    //     for(User user: userList){
    //         logger.info(user.toString());
    //     }
    // }

    public void sendOnConsole(List<Student> listT){
        System.out.println("ID студентов: ");
        for(Student student: listT){
            System.out.println(student.getStudentId());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}

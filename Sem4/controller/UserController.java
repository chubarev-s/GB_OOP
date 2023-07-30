package Sem4.controller;

import Sem4.data.Student;
import Sem4.data.Teacher;
import Sem4.data.User;
import Sem4.service.DataService;
import Sem4.service.StudentGroupService;
import Sem4.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController implements IUserController {

    @Override
    public void create(String firstName, String surName, String lastName) {
        User newUser = new User(firstName, surName, lastName, LocalDate.now());
        
    }

    

    // private final DataService dataService = new DataService();
    // private final StudentGroupService studentGroupService = new StudentGroupService();
    // private final UserView userView = new UserView();

    // public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
    //     dataService.create(firstName, secondName, patronymic, dateOfBirth);
    //     List<User> userList = dataService.getAll();
    //     userView.sendOnConsole(userList);
    // }

    // public void createStudentGroup(Teacher teacher, List<Student> students){
    //     studentGroupService.createStudentGroup(teacher, students);
    // }

    // public Student getStudentInStudentGroup(String firstName, String secondName){
    //     return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    // }

    // public List<Student> getSortedListStudentFromStudentGroup(){
    //     return studentGroupService.getSortedStudentGroup();
    // }

    // public List<Student> getSortedListByFIOStudentFromStudentGroup(){
    //     return studentGroupService.getSortedByFIOStudentGroup();
    // }
}

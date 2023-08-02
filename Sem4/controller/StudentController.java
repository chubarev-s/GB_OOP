package Sem4.controller;

import java.time.LocalDate;
import java.util.List;

import Sem4.data.Student;
import Sem4.view.UserView;


public class StudentController implements IUserController {
    
    private UserView studentsView = new UserView();
    
    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName, surName, lastName, LocalDate.now());
        
    }
    public void printConsole(List<Student> student) {
        studentsView.sendOnConsole(student);
    }
}

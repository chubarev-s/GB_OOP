package Sem4.controller;

import java.time.LocalDate;

import Sem4.data.Teacher;
import Sem4.data.User;

public class TecherController implements IUserController{
     @Override
    public void create(String firstName, String surName, String lastName) {
        User newTeacher = new Teacher(firstName, surName, lastName, LocalDate.now());
        
    }
    
}

package Sem4.controller;

import Sem4.data.User;
//-------------------------------------------------------
//Interface Segregation (Принцип разделения интерфейсов)
//-------------------------------------------------------
public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}


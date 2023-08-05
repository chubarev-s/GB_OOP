package Sem4.controller;

import Sem4.data.User;
//-------------------------------------------------------
//Interface Segregation (Принцип разделения интерфейсов)
// написали только нужную функцию, которую используем
//-------------------------------------------------------
public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}


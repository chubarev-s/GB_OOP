package Sem4.controller;

import Sem4.data.User;

public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}


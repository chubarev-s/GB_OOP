package Sem4.view;

import java.util.List;

import Sem4.data.User;
//-------------------------------------------------
// Dependency Inversion (Принцип инверсии зависимостей)
// UserView вызывает данный интерфейс, инструментом которого является User
//-------------------------------------------------
public interface UserViewInterface<T extends User>{
    
    void sendOnConsole(List<T> listT);
}

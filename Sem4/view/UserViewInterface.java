package Sem4.view;

import java.util.List;

import Sem4.data.User;

public interface UserViewInterface<T extends User>{
    
    void sendOnConsole(List<T> listT);
}

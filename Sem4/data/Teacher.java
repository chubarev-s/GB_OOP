package Sem4.data;

import java.time.LocalDate;
import java.util.Comparator;
//-------------------------------------------------------
// Liskov Substitution (Принцип подстановки Барбары Лисков)
// Teacher выдаёт тоже-самое что и User + дополнительные данные
//-------------------------------------------------------
public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
        
    }
}

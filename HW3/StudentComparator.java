package HW3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student NameFirstStudent, Student NameSecondStudent) {
        String nameFStud = NameFirstStudent.getFirstName() + NameFirstStudent.getSecondName() + NameFirstStudent.getLastName();
        String nameSStud = NameSecondStudent.getFirstName() + NameSecondStudent.getSecondName() + NameSecondStudent.getLastName();
        return nameFStud.compareToIgnoreCase(nameSStud);        
    }
    
}

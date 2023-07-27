package HW3;

import HW3.Student;
import HW3.StudentGroup;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import HW3.StudentGroup;

public class StudentGroupService {
    
private StudentGroup studentGroup;

public StudentGroupService(){
    this.studentGroup = new StudentGroup();
    }

    public StudentGroup getStudentGroup(){
        return studentGroup;
    }
    public StudentGroupService(StudentGroup students) {
        this.studentGroup = students;
    }

    public void setStudentGroup(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }

    public boolean removeStudent(String lastName, String secondName, String firstName) {
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        if (studentGroup.getStudentsList() == null) return false;
        List<Student> studentsList = studentGroup.getStudentsList();
        for (Student student: studentsList){
            if (student.equals(removeStudent)){
                studentsList.remove(student);
                return true;
            }
        }
        return false; 
    }

    public void sortStudentsId(){
        Collections.sort(studentGroup.getStudentsList());
    }

    public void sortStudentsName(){
        studentGroup.getStudentsList().sort(new StudentComparator());
    }


    /*
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student> iterator = studentGroupt.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
            student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    */
}

package HW3;

import java.util.ArrayList;
import java.util.List;

import HW3.StudentGroupService;

public class StudentGroup {
    private List<Student> studentsList;

    public StudentGroup(){
        studentsList = new ArrayList<>();
    }

    public StudentGroup(List<Student> studentsList){
        setStudentsList(studentsList);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
    @Override
    public String toString(){
        return "StudentGroup {" + 
            "student: " + studentsList + "}" ;
    }

    @Override
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(this);
    }

    public void addStudent(Student student){
        if (studentsList != null){
            studentsList.add(student);
        }
    }
    

}

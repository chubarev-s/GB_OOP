package HW3;

import HW3.Student;
import HW3.StudentGroup;

public class Controler {
    
    private StudentGroupService studentGroupService;
    private StreamService streamService;
    
    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }
    public void sortStudentIdOfStudentGroup(){
        studentGroupService.sortStudentsId();
    }

    public void sortNameOfStudentGroup(){
        studentGroupService.sortStudentsName();
    }

    public void sortSizeListStream(){
        streamService.sortStudentsStreamSize();
    }

   /* public void removeStudent(String lastName, String secondName, String firstName){
        studentGroupService.removeStudent(lastName,secondName,firstName);
    }*/
    public static void main(String[] args) {
        Student student1 = new Student(12, "Ivanov", "Ivan", "Ivanovich");
        Student student2 = new Student(13, "Petrov", "Ivan", "Ivanovich");
        Student student3 = new Student(11, "Sidorov", "Ivan", "Ivanovich");
        Student student4 = new Student(21, "Cytdkov", "Ivan", "Ivanovich");
        Student student5 = new Student(14, "Romanov", "Ivan", "Ivanovich");
        Student student6 = new Student(22, "dsfse", "Ivan", "Ivanovich");

        StudentGroup studentGroup = new StudentGroup();
        
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student5);
        studentGroup.addStudent(student6);

        StudentGroupService studentGroupService = new StudentGroupService();
        studentGroupService.setStudentGroup(studentGroup);
        System.out.println(studentGroup);
        studentGroupService.removeStudent("dsfse", "Ivan", "Ivanovich");

        System.out.println(studentGroup);

    }
}
 
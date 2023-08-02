package Sem5.model;

public class Teacher extends User{
    
    private int teacherID;
    
    
    public Teacher(String firstName, String secondName, String lastName, Integer teacherID){
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
        }
    
    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }  

    
}

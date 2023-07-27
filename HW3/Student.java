package HW3;

public class Student {
    private Integer studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer nemberOfStudent, String firstName, String secondName, String lastName){
    this.studentId = nemberOfStudent;
    this.firstName = firstName;
    this.secondName = secondName;
    this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 

    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        Student student = (Student) o;
        return (this.firstName.equals(student.firstName)&&
                    this.secondName.equals(student.secondName)&&
                    this.lastName.equals(student.lastName));
    }

    @Override
    public String toString(){
        return "Student {" + 
            " numberOfStudent: " + studentId +
            ", firstName: " + firstName + '\'' + 
            ", secondName: " + secondName + '\'' +
            ", lastName: " + lastName + '\'' +
            "}";

    }
}

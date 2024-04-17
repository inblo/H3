package org.example;

public class Student extends User implements Comparable<Student>{
    private Integer studentID;


    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(o.getStudentID() > studentID)
            return -1;
        else if(o.getStudentID() < studentID)
            return 1;
        else
            return 0;
        //return studentID.compareTo(o.getStudentID();
    }
}

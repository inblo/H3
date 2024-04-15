package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "1", "1", "1");
        Student student2 = new Student(2, "2", "2", "2");
        Student student3 = new Student(3, "3", "3", "3");
        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.add(student1);
        studentGroup1.add(student2);
        studentGroup1.add(student3);
        StudentGroupService service = new StudentGroupService(studentGroup1);
        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()){
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFio()){
            System.out.println(student);
        }
    }
}
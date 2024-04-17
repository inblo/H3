package org.example;

public class Teacher extends User implements Comparable<Teacher>{
    private Integer teacher;

    public Teacher(Integer teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacher = teacher;
    }
    public int getTeachers() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher=" + teacher +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return teacher.compareTo(o.getTeachers());
    }
}

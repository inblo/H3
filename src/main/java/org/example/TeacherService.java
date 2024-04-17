package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {

    private Teacher teachers;

    public TeacherService(Teacher teachers){
        this.teachers = teachers;
    }
    public Teacher getTeachers() {
        return teachers;
    }
    public List<Teacher> getSortedTeacher(){
        List<Teacher> teacherList = new ArrayList<>(teachers.getTeachers());
        Collections.sort(teacherList);
        return teacherList;
    }

}

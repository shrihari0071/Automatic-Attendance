package com.attendance.Automatic.Attendance.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher_details", schema = "public")
public class TeacherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;

    private String teacherName;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}


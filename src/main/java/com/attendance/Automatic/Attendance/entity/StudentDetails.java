package com.attendance.Automatic.Attendance.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_details", schema = "public")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String usn;

    private int rollNo;

    private String studentName;

    private int semester;

    private char section;

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}

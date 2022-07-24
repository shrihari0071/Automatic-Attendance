package com.attendance.Automatic.Attendance.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_attendance_status", schema = "public")
public class StudentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String usn;

    private Date date;

    private int attendanceStatus;

    private int attendancePercentage;

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = Integer.parseInt(attendanceStatus);
    }

    public int getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(int attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
}

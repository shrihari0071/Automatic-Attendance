package com.attendance.Automatic.Attendance.entity;

import javax.persistence.*;

@Entity
@Table(name = "login_credentials")
public class TeacherLoginDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.attendance.Automatic.Attendance.controller;

import com.attendance.Automatic.Attendance.AutomaticAttendanceApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}

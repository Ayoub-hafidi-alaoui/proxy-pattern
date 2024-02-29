package com.proxy;

import java.util.Date;

public class Teacher {
    public static void main(String[] args) {
        StudentProxy proxy = new StudentProxy(new Attendance(new Date(), false));
        proxy.attendSession();
    }
}

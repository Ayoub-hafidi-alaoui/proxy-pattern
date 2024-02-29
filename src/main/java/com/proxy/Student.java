package com.proxy;

public class Student implements DailySession {
    private Attendance attendance;

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendSession() {
        System.out.println("Student is attending the session");
    }

    public Attendance getAttendance() {
        return attendance;
    }
}


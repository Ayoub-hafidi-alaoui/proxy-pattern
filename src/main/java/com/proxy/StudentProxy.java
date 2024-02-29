package com.proxy;

public class StudentProxy extends Student{


    public StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendSession() {
        if(super.getAttendance().getPresent()) {
            super.attendSession();
        }
        else {
            System.out.println("Student is not attending the session");
        }

    }
}

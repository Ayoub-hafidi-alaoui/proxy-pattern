package com.proxy;

import java.util.Date;

public class Attendance {
    private Date date;
    private  Boolean isPresent;

    public Attendance(Date date, Boolean isPresent) {
        this.date = date;
        this.isPresent = isPresent;
    }

    public Boolean getPresent() {
        return isPresent;
    }
}

package com.loggy;

import java.util.Date;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class VideoLog extends Log {
    public VideoLog(String description, String name) {
        super(name, description, new Date());

    }

    public VideoLog() {
        super();
    }

    public VideoLog(Date date, String name) {
        super(date, name);
    }

    public VideoLog(String description, Date date) {
        super(description, date);
    }

    @Override
    public void create() {
        System.out.println("Video file created successfully");
    }

    @Override
    public void read() {
        System.out.println("Video file read successfully");
    }

    @Override
    public void update() {
        System.out.println("Video file updated successfully");
    }

    @Override
    public void delete() {
        System.out.println("Video file deleted successfully");
    }
}

package com.loggy;

import java.util.Date;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class TextLog extends Log {
    public TextLog(String description, String name) {
        super(name, description, new Date());

    }

    public TextLog() {
        super();
    }

    public TextLog(Date date, String name) {
        super(date, name);
    }

    public TextLog(String description, Date date) {
        super(description, date);
    }

    @Override
    public void create() {
        System.out.println("Text file created successfully");
    }

    @Override
    public void read() {
        System.out.println("Text file read successfully");
    }

    @Override
    public void update() {
        System.out.println("Text file updated successfully");
    }

    @Override
    public void delete() {
        System.out.println("Text file deleted successfully");
    }
}

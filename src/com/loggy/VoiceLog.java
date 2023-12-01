package com.loggy;

import java.util.Date;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class VoiceLog extends Log {
    public VoiceLog(String description, String name) {
        super(name, description, new Date());

    }

    public VoiceLog() {
        super();
    }

    public VoiceLog(Date date, String name) {
        super(date, name);
    }

    public VoiceLog(String description, Date date) {
        super(description, date);
    }

    @Override
    public void create() {
        System.out.println("Audio file created successfully");
    }

    @Override
    public void read() {
        System.out.println("Audio file read successfully");
    }

    @Override
    public void update() {
        System.out.println("Audio file updated successfully");
    }

    @Override
    public void delete() {
        System.out.println("Audio file deleted successfully");
    }
}

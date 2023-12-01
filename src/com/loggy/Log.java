package com.loggy;

import java.util.Date;

/**
 * Created by OSAGIE on 11/29/2023
 */
public abstract class Log {
    private int internalId;
    private String shortCode;
    private String name;
    private String description;
    private Date date;

    /**
     * @param name
     * @param description
     * @param date
     */
    public Log(String name, String description, Date date) {
        super();
        this.name = name;
        this.description = description;
        this.date = date;
    }

    /**
     * @param name
     */
    public Log(Date date, String name) {
        super();
        this.date = date;
        this.name = name;
    }

    /**
     * @param description
     * @param date
     */
    public Log(String description, Date date) {
        super();
        this.description = description;
        this.date = date;
    }

    public Log(){

    }

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
}

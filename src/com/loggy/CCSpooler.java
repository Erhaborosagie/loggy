package com.loggy;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class CCSpooler {
    List<Recording> recordings = new ArrayList<>();
    LoggyEventListener listener = new LoggyEventListener();
    public void enqueue(Recording recording) {

        listener.getEvent(recording);
    }

    public void shutdown() {
        Thread shutdownHook = new Thread(() -> System.out.println("\n \n *****Shutting Down"));
        Runtime.getRuntime().addShutdownHook(shutdownHook);
    }

}

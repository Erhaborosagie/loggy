package com.loggy;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class LoggyEventListener {
    CaptioningWorker worker = new CaptioningWorker();

    void getEvent(Recording recording){
        new Thread(new Runnable() {
            @Override
            public void run() {
                worker.processRecording(recording);
            }
        }).start();
    }
}

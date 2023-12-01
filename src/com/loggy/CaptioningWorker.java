package com.loggy;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class CaptioningWorker {
    static String thirdPartyUrl;

    void processRecording(Recording recording){
        //This part should be by the thirdService.
        //Just simulating here.
        String fileName = recording.getFileName();
        String[] fileParts = fileName.split("\\.");
        String type = fileParts[fileParts.length-1];

        //This part is local
        Log log;
        if (type.equalsIgnoreCase("mp4")){
            log = new VideoLog(Date.valueOf(LocalDate.now()), fileParts[0]);
        }else if (type.equalsIgnoreCase("text")){
            log = new TextLog(Date.valueOf(LocalDate.now()), fileParts[0]);
        }else{
            log = new VoiceLog(Date.valueOf(LocalDate.now()), fileParts[0]);
        }

        log.create();
    }
}

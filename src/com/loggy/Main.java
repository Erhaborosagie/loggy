/**
 *
 */
package com.loggy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * @author jesus
 *
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Recording> recordings = new LinkedList<Recording>();
        List<String> fileEnding = Arrays.asList(".mp4", ".text", ".mp3");
        // Set the mock-up recordings.
        for (int i = 0; i < 15; i++) {
            String fileName = "Recording " + String.valueOf(i) + fileEnding.get((int) (Math.random()*3));
            Long fileSize = (long) (Math.random() * (1024L - 1L));
            recordings.add(new Recording(UUID.randomUUID(), fileName, fileSize));
//            System.out.println(fileName);
        }

        // Enqueue recordings for closed captioning.
        CCSpooler spooler = new CCSpooler();
        recordings.forEach((recording) -> {
            spooler.enqueue(recording);
        });
        spooler.shutdown();
    }
}

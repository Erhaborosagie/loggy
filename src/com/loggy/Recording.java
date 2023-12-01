package com.loggy;

import java.util.UUID;

/**
 * Created by OSAGIE on 11/29/2023
 */
public class Recording {
    private final UUID randomUUID;
    private final String fileName;
    private final Long fileSize;

    public UUID getRandomUUID() {
        return randomUUID;
    }

    public String getFileName() {
        return fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public Recording(UUID randomUUID, String fileName, Long fileSize) {

        this.randomUUID = randomUUID;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
}

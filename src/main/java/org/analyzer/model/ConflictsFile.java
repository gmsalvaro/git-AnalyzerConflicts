package org.analyzer.model;

import java.util.List;

public class ConflictsFile {
    private List<Chunk> chunkList;
    private String fileName;


    public void setChunkList(List<Chunk> chunkList) {
        this.chunkList = chunkList;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Chunk> getChunkList() {
        return chunkList;
    }

    public String getFileName() {
        return fileName;
    }
}

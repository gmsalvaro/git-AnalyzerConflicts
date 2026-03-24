package org.analyzer.model;

public class Chunk {
    private String contentChunk;
    private int startLine;
    private int endLine;

    public Chunk(String contentChunk, int startLine, int endLine) {
        this.contentChunk = contentChunk;
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public String getContentChunk() {
        return contentChunk;
    }

    public int getEndLine() {
        return endLine;
    }

    public int getStartLine() {
        return startLine;
    }

    public void setContentChunk(String contentChunk) {
        this.contentChunk = contentChunk;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }
}

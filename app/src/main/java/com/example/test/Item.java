package com.example.test;

public class Item {

    private final int resID;
    private final String content;

    public int getResID() {
        return resID;
    }

    public String getContent() {
        return content;
    }

    public Item(int resID, String content) {
        this.resID = resID;
        this.content = content;
    }
}

package com.example.notes.text;

public class Text {
    private String content;

    public Text() {
    }

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Text{" +
                "content='" + content + '\'' +
                '}';
    }
}

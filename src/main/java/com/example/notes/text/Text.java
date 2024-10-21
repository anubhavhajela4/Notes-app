package com.example.notes.text;

import jakarta.persistence.*;

@Entity
@Table
public class Text {
    @Id
    @SequenceGenerator(
            name="text_sequence",
            sequenceName = "text_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "text_sequence"
    )
    private Integer id;
    private String content;

    public Text() {
    }

    public Text(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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

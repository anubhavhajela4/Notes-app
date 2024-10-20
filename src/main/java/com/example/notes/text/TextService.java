package com.example.notes.text;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TextService {

    public List<Text> getText() {
        return List.of(
                new Text(
                        "Hello World . This is my notes app"
                )
        );
    }
}

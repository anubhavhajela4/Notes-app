package com.example.notes.text;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/text")
public class TextController {
    @GetMapping
    public List<Text> getText() {
        return List.of(
                new Text(
                        "Hello World . This is my notes app"
                )
        );
    }
}

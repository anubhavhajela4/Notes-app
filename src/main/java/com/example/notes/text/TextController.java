package com.example.notes.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/text")
public class TextController {
    private final TextService textService;
    @Autowired
    public TextController(TextService textService) {
        this.textService = textService;
    }
    @GetMapping
    public List<Text> getText() {
    return textService.getText();
    }
}

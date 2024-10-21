package com.example.notes.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewText(@RequestBody Text text) {
        textService.addNewText(text);
    }
    @DeleteMapping(path="{textId}")
    public void deleteText(@PathVariable("textId")Long textId) {
        textService.deleteText(textId);
    }
    @PutMapping(path = "{textId}")
    public void updateText(
            @PathVariable("textId")Long textId,
            @RequestParam(required = false) String content) {
        textService.updateText(textId,content);
    }
}

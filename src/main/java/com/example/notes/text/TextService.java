package com.example.notes.text;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TextService {
    private final TextRepository textRepository;
    @Autowired
    public TextService(TextRepository textRepository) {
        this.textRepository = textRepository;
    }
    public List<Text> getText() {
        return textRepository.findAll();
    }
    public void addNewText(Text text) {
        Optional<Text> TextOptional = textRepository.findTextByContent(text.getContent());
        if(TextOptional.isPresent()) {
            throw new IllegalStateException("title taken");
        }
        textRepository.save(text);
    }
    public void deleteText(Long textId) {
    boolean exist =textRepository.existsById(textId);
    if(!exist) {
        throw new IllegalStateException("text with id "+textId+" does not exist");
    }
    textRepository.deleteById(textId);
    }
    @Transactional
    public void updateText(Long textId, String content) {
        Text text = textRepository.findById(textId).orElseThrow(()-> new IllegalStateException(
                "text with id "+textId+"does not exist"));
        if(content!=null &&content.length()>0 &&
        !Objects.equals(text.getContent(), content)) {
            text.setContent(content);
        }

    }
}

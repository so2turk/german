package com.so2turk.backend.controller;

import com.so2turk.backend.model.Word;
import com.so2turk.backend.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private WordRepository wordRepository;

    @PostMapping ("/create")
    public void createWord (@RequestBody Word word) {
        wordRepository.insert(word);
    }

    @PostMapping ("/delete/{id}")
    public void deleteWord (@PathVariable String id) {
        wordRepository.deleteById(id);
    }

    @GetMapping ("/list")
    public List<Word> listWord () {
        return wordRepository.findAll();

    }

}

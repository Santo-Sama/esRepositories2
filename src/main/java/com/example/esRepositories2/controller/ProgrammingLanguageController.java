package com.example.esRepositories2.controller;

import com.example.esRepositories2.entities.ProgrammingLanguage;
import com.example.esRepositories2.repostiroies.ProgrammingLanguageRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProgrammingLanguageController {

    @Autowired
    private ProgrammingLanguageRepositories programmingLanguageRepositories;

    @PostMapping
    public ProgrammingLanguage create(@RequestBody ProgrammingLanguage programmingLanguage){
    ProgrammingLanguage programmingLanguageSaved =programmingLanguageRepositories.saveAndFlush(programmingLanguage);
    return programmingLanguageSaved;
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getOne(@PathVariable long id){
        if (programmingLanguageRepositories.existsById(id)) {
            ProgrammingLanguage programmingLanguage = programmingLanguageRepositories.getById(id);
            return programmingLanguage;
        }
        else {
            return new ProgrammingLanguage();
        }
    }


}

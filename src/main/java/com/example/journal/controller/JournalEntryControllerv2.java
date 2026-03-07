package com.example.journal.controller;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.journal.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentry){
        
        return true;
    } //tells the spring to take the data from the request and  convert it into java object that can be used in code
  
    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry updatedEntry){
        return null;
    }
    
}

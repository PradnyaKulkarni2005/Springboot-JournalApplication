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
import org.bson.types.ObjectId;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public java.util.List<JournalEntry> getAll(){
        return journalEntryService.getAllEntries();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myentry){
        myentry.setDate(new java.util.Date()); // set the current date when creating a new entry
        return journalEntryService.saveEntry(myentry);
    } //tells the spring to take the data from the request and  convert it into java object that can be used in code
  
    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable String myId){
        return journalEntryService.getEntryById(new ObjectId(myId));
    }

    @DeleteMapping("id/{myId}")
    public void deleteEntryById(@PathVariable String myId){
        journalEntryService.deleteEntry(new ObjectId(myId));
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable String myId, @RequestBody JournalEntry updatedEntry){
        return journalEntryService.updateEntry(new ObjectId(myId), updatedEntry);
    }
    
}

package com.example.journal.service;
import com.example.journal.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.journal.entity.JournalEntry;
import org.springframework.stereotype.Component;
@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry entry){
        journalEntryRepo.save(entry);
    }
}

package com.example.journal.service;
import com.example.journal.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.journal.entity.JournalEntry;
import org.springframework.stereotype.Component;
import org.bson.types.ObjectId;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public JournalEntry saveEntry(JournalEntry entry) {
        // delegate to repository and return persisted object
        return journalEntryRepo.save(entry);
    }

    public java.util.List<JournalEntry> getAllEntries() {
        return journalEntryRepo.findAll();
    }

    public JournalEntry getEntryById(ObjectId id) {
        return journalEntryRepo.findById(id).orElse(null);
    }

    public void deleteEntry(ObjectId id) {
        journalEntryRepo.deleteById(id);
    }

    public JournalEntry updateEntry(ObjectId id, JournalEntry updated) {
        // ensure the ID is set so save will update
        updated.setId(id);
        return journalEntryRepo.save(updated);
    }
}

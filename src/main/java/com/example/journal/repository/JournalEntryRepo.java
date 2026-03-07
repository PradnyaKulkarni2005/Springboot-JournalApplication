package com.example.journal.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import com.example.journal.entity.JournalEntry;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {
    // MongoRepository provides CRUD operations; the ID now uses ObjectId.




}

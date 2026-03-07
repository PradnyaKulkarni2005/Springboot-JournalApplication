package com.example.journal.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.journal.entity.JournalEntry; 

public interface JournalEntryRepo extends MongoRepository<JournalEntry , String>{ // MongoRepository is a Spring Data interface that provides CRUD operations for MongoDB. By extending this interface, JournalEntryRepo inherits methods for saving, finding, updating, and deleting documents in a MongoDB collection. The generic parameters specify the type of the document (JournalEntry) and the type of the document's ID (Long).




}

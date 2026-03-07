package com.example.journal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import java.util.Date;

@Document(collection = "journal_entries") // This annotation indicates that this class is a MongoDB document and specifies the collection name where instances of this class will be stored. In this case, the collection is named "journal_entries". This allows Spring Data MongoDB to map instances of JournalEntry to documents in the specified collection.
public class JournalEntry {
    @Id // The Document ID field stored as a MongoDB ObjectId. Spring Data MongoDB will generate one automatically when saving if it is null.
    private ObjectId id;
    private String title;
    private String content;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    

}

package com.example.journal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document(collection = "journal_entries") // This annotation indicates that this class is a MongoDB document and specifies the collection name where instances of this class will be stored. In this case, the collection is named "journal_entries". This allows Spring Data MongoDB to map instances of JournalEntry to documents in the specified collection.
public class JournalEntry {
    @Id // This annotation indicates that the field it annotates is the primary key (ID) of the document. In this case, the "id" field will be used as the unique identifier for each JournalEntry document in the MongoDB collection. Spring Data MongoDB will automatically generate a unique value for this field when a new JournalEntry is saved to the database, unless a value is explicitly provided.
    private String id;
    private String title;
    private String content;
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
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

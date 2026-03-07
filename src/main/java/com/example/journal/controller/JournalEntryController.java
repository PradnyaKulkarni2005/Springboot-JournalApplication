// package com.example.journal.controller;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.List;
// import java.util.ArrayList;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import com.example.journal.entity.JournalEntry;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/_journal")
// public class JournalEntryController {
//     private Map<Long,JournalEntry> journalEntries = new HashMap<>();
//     @GetMapping
//     public List<JournalEntry> getAll(){
//         return new ArrayList<>(journalEntries.values());
//     }
//     @PostMapping
//     public boolean createEntry(@RequestBody JournalEntry myentry){
//         journalEntries.put(myentry.getId(), myentry);
//         return true;
//     } //tells the spring to take the data from the request and  convert it into java object that can be used in code
  
//     @GetMapping("id/{myId}")
//     public JournalEntry getEntryById(@PathVariable Long myId){
//         return journalEntries.get(myId);
//     }

//     @DeleteMapping("id/{myId}")
//     public JournalEntry deleteEntryById(@PathVariable Long myId){
//         return journalEntries.remove(myId);
//     }

//     @PutMapping("id/{myId}")
//     public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry updatedEntry){
//         if(journalEntries.containsKey(myId)){
//             journalEntries.put(myId, updatedEntry);
//             return updatedEntry;
//         }
//         return null;
//     }
    


// }

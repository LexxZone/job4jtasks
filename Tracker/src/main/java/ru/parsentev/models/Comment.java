package ru.parsentev.models;

public class Comment {  
    private String id;
    
    public String name;
    
    public String description;
    
    public long create;
    
    public Comment () {
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public long getCreate(){
        return this.create;
        
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
}
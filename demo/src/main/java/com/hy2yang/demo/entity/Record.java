package com.hy2yang.demo.entity;

import java.io.Serializable;

public class Record implements Serializable{
    
    
    private static final long serialVersionUID = -6665358364803420865L;
    
    private Integer id;      
    private String message;
    private boolean URL;    
    private int group;
    
    public Boolean isURL() {
        return Boolean.valueOf(URL);
    }

    public void setURL(boolean isURL) {
        URL = isURL;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
   
}

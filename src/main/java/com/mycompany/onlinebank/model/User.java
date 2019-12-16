
package com.mycompany.onlinebank.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author liyuanzhang
 
 1.create pojo object(Plain Old Java Object)
 
 2.create constructor(empty and default) In order to return User 
 objects through our API in XML or JSON formats as part of our responses.
 
 3.create setter and getter
 */



//indicate the JAXB framework which is the object to use for
//marshalling/unmarshalling XML / JSON formats.
@XmlRootElement 
public class User {
    private long userId;
    private String name;
    private String email;
    private String password;
    //private Account[] acc;// store multiple accounts for User
    private List<Account> accList = new ArrayList<>(); //using an arraylist instead of normal array for dynamic sizing

    // empty constractor
    public User() {
        
    }
    
     // constractor with param
    public User(long userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    // constractor with param
    public User(long userId, String name, String email, String password, List<Account> accList) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accList = accList;
    }
    // create getter and setter
    public long getId() {
        return userId;
    }

    public void setId(long id) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     public List<Account> getList() {
        return accList;
    }

    public void setList(List<Account> list) {
        this.accList = accList;
    }
    
    
}

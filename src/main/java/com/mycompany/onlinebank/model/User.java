
package com.mycompany.onlinebank.model;

import javax.xml.bind.annotation.XmlRootElement;

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
    private long id;
    private String name;
    private String address;
    private String email;
    private String password;
    private Account[] acc;// store multiple accounts for User

    // empty constractor
    public User() {
        
    }
    
    // constractor with param
    public User(long id, String name, String address, String email, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.acc = new Account[0];
    }
    // create getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Account[] getAcc() {
        return acc;
    }

    public void setAcc(Account[] acc) {
        this.acc = acc;
    }
    
    
}

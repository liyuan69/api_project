
package com.mycompany.onlinebank.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author liyuanzhang
 */


//indicate the JAXB framework which is the object to use for
//marshalling/unmarshalling XML / JSON formats.
@XmlRootElement 
public class User {

    private int userId;
    private String name;
    private String email;
    private String password;
    private List<User> users; 
    private List<Account> accounts;

    // empty constractor
    public User() {
        
    }

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.users = users;
        this.accounts = accounts;
    }
    


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}


package com.mycompany.onlinebank.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

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
    private String address;
    private String email;
    private String password;
    private List<User> users; 
    private List<Account> accounts;

    public User(int userId, String name, String address, String email, String password, List<Account> accounts) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}


package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author liyuanzhang
 will contain the Java classes defining the services
 I want to provide for my User Model
 */

public class UserService {
    
    Database b = new Database();
    private List<User> userList= b.getUserDB();
   
 
    public User getUsers(int userId) {
        return userList.get(userId);
    }
    
    
    public User createNewUser(User user){
        userList.add(user);
        return user;    
    }
  
}

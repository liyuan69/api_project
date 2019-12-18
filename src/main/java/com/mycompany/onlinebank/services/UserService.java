
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
    

//    Database b = new Database();
//    private List<User> userList= b.getUserDB();
   
 
//    public User getUsers(int userId) {
//        return userList.get(userId);}

    public static List<User> list = new ArrayList<>();
    
    public List<User> createAllUsers() {
        User m1 = new User(0, "Enda", "en@gmail.com","123");
        User m2 = new User(1, "Liam", "li@gmail.com","123");

        list.add(m1);
        list.add(m2);
        return list;
       
    }
    
    
    public User getUser(int userId) {
        return list.get(userId-1);
    }
    
    
    public User createNewUser(User user){
        list.add(user);
        return user;    
    }
  
}

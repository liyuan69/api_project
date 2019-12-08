
package com.mycompany.onlinebank.services;

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
    
    public static List<User> list = new ArrayList<>();
    
    public List<User> createAllUsers() {
        User m1 = new User(0, "Enda", "dublin", "en@gmail.com","123");
        User m2 = new User(1, "Liam", "dublin", "li@gmail.com","123");

        list.add(m1);
        list.add(m2);
        return list;
       
    }
    
   
    
    public User getUser(int id) {
        return list.get(id-1);
    }
    
    public User createAcc(){
        return null;
    } 
    
    
    //get balance 
    //
    
}

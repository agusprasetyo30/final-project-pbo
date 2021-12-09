/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import final_project.Database;
import model.User;
import java.util.ArrayList;

/**
 *
 * @author GokPrazPC
 */
public class UserController {
    public Database database;
    
    public UserController() {
        this.database = new Database();
    }
    
    public void save(User user) {
        this.database.getDataUser().add(user);
    }
    
    public void update(User user) {
        
    }
    
    public void delete(String id) {
        
    }
    
    public void readByID(String id) {
        
    }
    
    public void readAll(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("ID : " + users.get(i).getId());
            System.out.println("Nama : " + users.get(i).getName());
            System.out.println("Username : " + users.get(i).getUsername());
        }
    }
    
    public User login(String username, String password) {
        for (int i = 0; i < database.getDataUser().size(); i++) {
            if (database.getDataUser().get(i).getUsername().equals(username) 
                    && database.getDataUser().get(i).getPassword().equals(password)) {
                return database.getDataUser().get(i);
            }
        }
        
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserController;
import model.User;

/**
 *
 * @author GokPrazPC
 */
public class LoginView {
    public String username;
    public String password;
    
    public LoginView(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User login(UserController controller) {
        User login = controller.login(this.username, this.password);
        if (login != null) {
            return login;
        }
           
        return null;
    }
}

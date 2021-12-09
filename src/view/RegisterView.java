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
public class RegisterView {
    
    public RegisterView() {
        
    }
    
    public void register(UserController controller, User user) {
        controller.save(user);
    }
}

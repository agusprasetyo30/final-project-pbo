/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import model.User;
import model.Contact;
import java.util.ArrayList;

/**
 *
 * @author GokPrazPC
 */
public class Database {
    private ArrayList<User> dataUser; 
    private ArrayList<Contact> dataPhone; 
    
    public Database() {
        this.dataPhone = new ArrayList<>();
        this.dataUser = new ArrayList<>();
    }
    
    public ArrayList<User> getDataUser() {
        return this.dataUser;
    }
    
    public ArrayList<Contact> getDataPhone() {
        return this.dataPhone;
    }
}

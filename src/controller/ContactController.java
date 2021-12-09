/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import final_project.Database;
import model.Contact;
import java.util.ArrayList;

/**
 *
 * @author GokPrazPC
 */
public class ContactController {
    public Database database;
    
    public ContactController() {
        this.database = new Database();
    }
    
    public void save(Contact phone) {
        this.database.getDataPhone().add(phone);
    }
    
    public void update(Contact phone, String id) {
        for (int i = 0; i < this.database.getDataPhone().size(); i++) {
            if (this.database.getDataPhone().get(i).getId().equals(id)) {
                this.database.getDataPhone().set(i, phone);
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < this.database.getDataPhone().size(); i++) {
            if (this.database.getDataPhone().get(i).getId().equals(id)) {
                this.database.getDataPhone().remove(i);
            }
        }
    }
    
    public void readAll(ArrayList<Contact> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("ID : " + contacts.get(i).getId());
            System.out.println("Nama : " + contacts.get(i).getNama());
            System.out.println("Nomer Telepon : " + contacts.get(i).getTelepon());
            System.out.println("");
        }
    }
}

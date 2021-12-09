/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContactController;
import model.Contact;

/**
 *
 * @author GokPrazPC
 */
public class UpdateContactView {
    private ContactController controller;

    public UpdateContactView() {
        this.controller = new ContactController();
    }
    
    public void updateContact(ContactController contactController, Contact contact, String id) {
        this.controller = contactController;
        this.controller.update(contact, id);
    }
}

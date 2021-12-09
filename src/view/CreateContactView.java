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
public class CreateContactView {
    private ContactController controller;

    public CreateContactView() {
        this.controller = new ContactController();
    }
    
    public void createContact(ContactController contractController, Contact contact) {
        this.controller = contractController;
        this.controller.save(contact);
    }
}
